package game_2;

import coordinates.Coordinates;
import jumper.Jumper;
import player_2.Player_2;
import dice.Dice;
import board_2.Board_2;

public class Game_2 
{
   Board_2 board;
   Player_2[] players;
   Coordinates[] places;
   Dice dice;
   boolean[] isAllowed;
   int turn;

   public Game_2(Player_2[] players,Board_2 board,Dice dice)
   {
    this.board=board;
    this.players=players;
    this.dice=dice;
    turn=0;
    isAllowed=new boolean[players.length];
    places=new Coordinates[players.length];

    for(int i=0;i<players.length;i++)
    {
        places[i]=new  Coordinates(board.getBoardSize()-1,0);
    }
   }

   public void play()
   {
    while(true)
    {
     int num=dice.diceRoll();
     System.out.println(players[turn].getPlayerName()+" rolled -> "+num+ "   ["+places[turn].getRow()+","+places[turn].getCol()+"]");

     if(!isAllowed[turn])
     {
        if(num!=1)
        {
            turn=1-turn;
            continue;
        }
        else
        {
            isAllowed[turn]=true;
        }
     }

     Coordinates newCoordinates=getNewCoordinates(places[turn],num);
     if(newCoordinates.getRow()<0)
     {
        System.out.println(players[turn].getPlayerName()+" has won");
        return;
     }
     places[turn]=newCoordinates;
     turn=1-turn;
    }

   }

   private Coordinates getNewCoordinates(Coordinates oldCoordinates,int num)
   {
     int row=oldCoordinates.getRow();
     int col=oldCoordinates.getCol();

     while(num>0)
     {
        if(row%2!=0)
        {
            if(col==board.getBoardSize()-1)
               row--;
            else
               col++;
        }
        else
        {
            if(col==0)
              row--;
            else 
              col--;
        }
        num--;
     }
   
     if(row<0)
       return new Coordinates(row, col);
     if(checkIfJumperExist(row,col))
     {
        Jumper jumper=board.map.get(board.board[row][col]);
        return jumper.end;
     }
     return new Coordinates(row, col);

   }

   private boolean checkIfJumperExist(int row,int col)
   {
     return board.map.containsKey(board.board[row][col]);
   }
}
