import player_2.Player_2;
import dice.Dice;
import java.util.*;
import board_2.Board_2;
import game_2.Game_2;

public class App
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);

        Player_2[] p=new Player_2[2];

        p[0]=new Player_2();
        p[0].setPlayerDetailsFromUserInput(p[0]);

        p[1]=new Player_2();
        p[1].setPlayerDetailsFromUserInput(p[1]);

        System.out.println("\nfirst Player name : "+p[0].getPlayerName());
        System.out.println("second Player name : "+p[1].getPlayerName()+"\n");
        
        Dice d=new Dice();
   
        Board_2 b=new Board_2(10);
        b.printBoard();

        Game_2 g=new Game_2(p,b,d);
        g.play();
   
        sc.close();
    }
}
