import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("Enter 3 names:");
    String [] names = new String [3];
    for (int i = 0; i <= 2; i++)
    {
      names [i] = console.nextLine();
    } 
    int largest = 0;
    if (names[1].length() >= names[0].length())
    {
      largest = 1;
    }
    if ((names[2].length() >= names[1].length()) && (names[2].length() >= names[0].length()))
    {
      largest = 2;
    }
    for (int i = 0; i < names[largest].length(); i++)
    {
      for (int j = 0; j < 3; j++)
      {
        if (i < names[j].length())
        {
          System.out.print(names[j].charAt(i) + " ");
        }
        else
        {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
