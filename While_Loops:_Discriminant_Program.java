import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    int user = 1;
    while (user == 1)
    {
      System.out.println("Please enter variable a:");
      double a = console.nextDouble();
      System.out.println("Please enter variable b:");
      double b = console.nextDouble();
      System.out.println("Please enter variable c:");
      double c = console.nextDouble();
      if (((b*b)-(4*a*c)) > 0)
      {
        System.out.println("There are 2 real roots");
      }
      else if (((b*b)-(4*a*c)) == 0)
      {
        System.out.println("There is one repeated root");
      }
      else
      {
        System.out.println("There are no real roots");
      }
      System.out.println("Would you like to run the program again? 1 = yes, 0 = no:");
      user = console.nextInt();
    }
  }
}
