package board_2;

import jumper.Jumper;
import java.util.*;

import coordinates.Coordinates;

public class Board_2 
{
    int size;
   public  String[][] board;
   public  HashMap<String,Jumper> map;

    public Board_2(int size)
  {
    this.size=size;
    board=new String[size][size];
    int count=1;
    
    for(int row=size-1;row>=0;row--)
    {
        if(row%2!=0)
        {
            for(int col=0;col<size;col++)
            {
                board[row][col]=count++ + "";
            }
        }
        else
        {
            for(int col=size-1;col>=0;col--)
            {
                board[row][col]=count++ + "";
            }
        }
    }

    this.map=new HashMap<>();
     
      map.put("7",new Jumper(new Coordinates(9, 6),new Coordinates(7, 5)));
      map.put("13",new Jumper(new Coordinates(8, 7),new Coordinates(4, 5)));
      map.put("21",new Jumper(new Coordinates(7, 0),new Coordinates(2, 2)));
      map.put("36",new Jumper(new Coordinates(6, 4),new Coordinates(3, 3)));
      map.put("44",new Jumper(new Coordinates (5, 3),new Coordinates(2, 5)));
      map.put("46",new Jumper(new Coordinates(5, 5),new Coordinates(9, 6)));
      map.put("47",new Jumper(new Coordinates(5, 6),new Coordinates(2, 7)));
      map.put("50",new Jumper(new Coordinates(5, 9),new Coordinates(0, 8)));
      map.put("52",new Jumper(new Coordinates(4, 8),new Coordinates(7, 6)));
      map.put("59",new Jumper(new Coordinates(4, 1),new Coordinates(8, 1)));
      map.put("61",new Jumper(new Coordinates(3, 0),new Coordinates(0, 4)));
      map.put("65",new Jumper(new Coordinates(3, 4),new Coordinates(7, 1)));
      map.put("66",new Jumper(new Coordinates(3, 3),new Coordinates(1, 2)));
      map.put("71",new Jumper(new Coordinates(2, 9),new Coordinates(0, 6)));
      map.put("77",new Jumper(new Coordinates(3, 5),new Coordinates(8, 3)));
      map.put("90",new Jumper(new Coordinates(1, 9),new Coordinates(8, 9)));
      map.put("93",new Jumper(new Coordinates(0, 7),new Coordinates(3, 8)));
      map.put("99",new Jumper(new Coordinates(0, 1),new Coordinates(9, 8)));
  }


  public void printBoard()
  {
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size;j++)
        {
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
  }
    
  public int getBoardSize()
  {
    return this.size;
  }
    

}
