import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("Please enter a sentence:");
    String sentence = console.nextLine();
    System.out.println("Character length of sentence: " + sentence.length());
    System.out.println("The first word is: " + sentence.substring(0,sentence.indexOf(" ")));
    int num1 = sentence.indexOf(" ") + 1;
    int num2 = sentence.indexOf(" ", num1);
    if (num2 != -1)
    {
      System.out.println("The second word is: " + sentence.substring(num1,num2));
    }
    else
    {
      System.out.println("The second word is: " + sentence.substring(num1));
    }
    int periodPunctuation = sentence.indexOf(".");
    int questionPunctuation = sentence.indexOf("?");
    int exclamationPunctuation = sentence.indexOf("!");
    if (periodPunctuation != -1)
    {
      System.out.println("The ending punctuation is: " + sentence.charAt(periodPunctuation));
    }
    else if (questionPunctuation != -1)
    {
      System.out.println("The ending punctuation is: " + sentence.charAt(questionPunctuation));
    }
    else if (exclamationPunctuation != -1)
    {
      System.out.println("The ending punctuation is: " + sentence.charAt(exclamationPunctuation));
    }
    else
    {
      System.out.println("There is no ending punctuation");
    }
  }
}
