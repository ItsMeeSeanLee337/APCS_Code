import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    double userGrade = 0;
    int total = 0;
    int gradeAverage = 0;
    int numPass = 0;
    int numFail = 0;
    while (userGrade != -1)
    {
      System.out.println("Please enter your grade:");
      userGrade = console.nextDouble();
      gradeAverage += userGrade;
      if ((userGrade < 65) && (userGrade != -1))
      {
        numFail++;
      }
      else if (userGrade != -1)
      {
        numPass++;
      }
      if (userGrade != -1)
      {
        total++;
      }
    }
    double average = gradeAverage / total;
    double percentFail = (numFail / total) * 100;
    double percentPass = (numPass / total) * 100;
    System.out.println("Number of failing grades: " + numFail);
    System.out.println("Number of passing grades: " + numPass);
    System.out.println ("Average grade: " + (average + 1));
    System.out.println("Percent pass: " + percentPass + " %");
    System.out.println("Percent fail: " + percentFail + " %");
  }
}
