package player_2;

import java.util.Scanner;

public class Player_2 
{
   String name;
   String emailId;
   String contactNo;
   String address;
   int age;

   public void setPlayerDetails(String name,String emailId,String contactNo,String address,int age)
   {
    this.name=name;
    this.age=age;
    this.address=address;
    this.contactNo=contactNo;
    this.emailId=emailId;
   }

   public void setPlayerName(String name)
   {
    this.name=name;
   }

   public void getPlayeretails()
   {
    System.out.println("Player name : "+this.name);
    System.out.println("Player age : "+this.age);
    System.out.println("Player contactNo : "+this.contactNo);
    System.out.println("Player emailId : "+this.emailId);
    System.out.println("Player address : "+this.address);
   }

   public String getPlayerName()
   {
     return this.name;
   }

   public void setPlayerDetailsFromUserInput(Player_2 p)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the player details;");
    System.out.print("Enter player name : ");
    String name=sc.nextLine();
    System.out.print("Enter player age : ");
    int age=(sc.nextLine().charAt(0))-'0';
    System.out.print("Enter player contact number : ");
    String contactNo=sc.nextLine();
    System.out.print("Enter player emailId : ");
    String emailId=sc.nextLine();
    System.out.print("Enter player address: ");
    String address=sc.nextLine();

    p.setPlayerDetails(name,emailId,contactNo,address,age);
    
   }
}
