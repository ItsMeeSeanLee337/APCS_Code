import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("Please enter your grade");
    int grade = console.nextInt();
//Conventional if-statement method of checking cases
/*
    if (grade = 9)
    {
      System.out.println("You are a freshman");
    }
    else if (grade = 10)
    {
      System.out.println("You are a sophmore");
    }
    else if (grade = 11)
    {
      System.out.println("You are a junior");
    }
    else if (grade = 12)
    {
      System.out.println("You are a senior");
    }
    else
    {
      System.out.println("Invalid input");
    }
*/
//Switch statement method of checking cases 
    switch (grade)
    {
      case 9:
        System.out.println("You are a freshman");
        break;
      case 10:
        System.out.println("You are a sophmore");
        break;
      case 11:
        System.out.println("You are a junior");
        break;
      case 12:
        System.out.println("You are a senior");
        break;
      default:
        System.out.println("Invalid method");
    }
  }
}
