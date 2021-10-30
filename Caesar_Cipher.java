import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("Do you want to encode, decode, or brute force a message? Type 2 to encode, 1 to decode, 0 to brute force: ");
    int encodeDecode = console.nextInt();
    String userInput = "";
    String finalMessage = "";
    int shift;
    if (encodeDecode == 2)
    {
      System.out.println("Please enter the message you would like to encode: ");
      console.nextLine();
      userInput = console.nextLine();
      userInput = userInput.toUpperCase();
      System.out.println("Please enter the shift value: ");
      shift = console.nextInt();
      for (int i = 0; i < userInput.length(); i++)
      {
        if (userInput.charAt(i) != ' ')
        {
          if ((userInput.charAt(i) + shift) > 90)
          {
            finalMessage += (char)(userInput.charAt(i) + shift - 26);
          }
          else
          {
            finalMessage += (char)(userInput.charAt(i) + shift);
          }
        }
        else
        {
          finalMessage += ' ';
        }
      }
      System.out.println("Encoded message: " + finalMessage);
    }
    else if (encodeDecode == 1)
    {
      System.out.println("Please enter the message you would like to decode: ");
      console.nextLine();
      userInput = console.nextLine();
      userInput = userInput.toUpperCase();
      System.out.println("Please enter the shift value: ");
      shift = console.nextInt();
      for (int i = 0; i < userInput.length(); i++)
      {
        if (userInput.charAt(i) != ' ')
        {
          if ((userInput.charAt(i) - shift) < 65)
          {
            finalMessage += (char)(userInput.charAt(i) - shift + 26);
          }
          else
          {
            finalMessage += (char)(userInput.charAt(i) - shift);
          }
        }
        else
        {
          finalMessage += ' ';
        }
      }
      System.out.println("Decoded Message: " + finalMessage);
    }
    else
    {
      System.out.println("Please enter the message you would like to decode: ");
      console.nextLine();
      userInput = console.nextLine();
      userInput = userInput.toUpperCase();
      for (int s = 0; s <= 26; s++)
      {
        for (int i = 0; i < userInput.length(); i++)
        {
          if (userInput.charAt(i) != ' ')
          {
            if ((userInput.charAt(i) - s) < 65)
            {
              finalMessage += (char)(userInput.charAt(i) - s + 26);
            }
            else
            {
              finalMessage += (char)(userInput.charAt(i) - s);
            }
          }
          else
          {
            finalMessage += ' ';
          }
        }
        System.out.println("Shift value of " + s + ": " + finalMessage);
        finalMessage = "";
      }
    }
  }
}
