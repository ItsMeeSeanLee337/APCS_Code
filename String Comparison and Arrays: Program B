import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("Try and guess my favorite color, you have 3 tries:");
    String guess = console.next();
    boolean trueFalse = guess.equalsIgnoreCase("black");
    if (trueFalse == true)
    {
      System.out.println("You guessed my favorite color!");
    }
    else if (trueFalse == false)
    {
      System.out.println("Try again, you have 2 more tries:");
      guess = console.next();
      trueFalse = guess.equalsIgnoreCase("black");
      if (trueFalse == true)
      {
        System.out.println("You guessed my favorite color!");
      }
      else if (trueFalse == false)
      {
        System.out.println("Try again, you have 1 more try:");
        guess = console.next();
        trueFalse = guess.equalsIgnoreCase("black");
        if (trueFalse == true)
        {
          System.out.println("You guessed my favorite color!");
        }
        else
        {
          System.out.println("You didn't guess my favorite color is Black, sorry!");
        }
      }
    }
  }
}
