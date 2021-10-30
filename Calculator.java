import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("Please enter your first value:");
    int user1 = console.nextInt();
    System.out.println("Please enter your second value: ");
    int user2 = console.nextInt();
    System.out.println("Please enter your operator. 1 = addition. 2 = subtraction. 3 = multiplication. 4 = division:");
    int user3 = console.nextInt();
    switch (user3)
    {
      case 1:
        System.out.println(user1 + " + " + user2 + " = " + (user1+user2));
        break;
      case 2:
        System.out.println(user1 + " - " + user2 + " = " + (user1/user2));
        break;
      case 3:
        System.out.println(user1 + " x " + user2 + " = " + (user1*user2));
        break;
      case 4:
        System.out.println(user1 + " / " + user2 + " = " + (user1/user2));
        break;
      default:
        System.out.println("Operator input is invalid");
    }
  }
}
