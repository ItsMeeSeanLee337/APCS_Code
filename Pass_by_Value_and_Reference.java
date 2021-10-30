class Main 
{
  public static void main (String[] args) 
  {
    double num1 = 3;
    String word = "Hello";
    System.out.println("num1: " + num1 + ", word: " + word);
    doStuff(num1, word);
    System.out.println("num1: " + num1 + ", word: " + word);
  }
  public static void doStuff (double num1, String word)
  {
    num1++; 
    word += word;
  }
}
