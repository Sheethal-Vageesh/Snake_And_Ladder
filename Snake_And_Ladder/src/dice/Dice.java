package dice;

public class Dice
{
   int MAX=6;
   int MIN=1;

   public int diceRoll()
   {
    double d=(Math.random() * (MAX-MIN)) + MIN;
    return (int)d;
   }
}
