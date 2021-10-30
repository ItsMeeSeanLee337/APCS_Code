import java.util.Scanner;
//Allows user to enter input by using a scanner
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
//Scanner declaration: Scanner scanner-name = new Scanner (System.in);
    System.out.println("Please enter a number:");
    double pi = console.nextDouble();
//Primitive types of variables: int, char, double, boolean
    double radius = 5;
//double declaration: double name-of-variable = interger with decimals
    int diameter = 10;
//int declaration: int name-of-variable = integer without decimals
    double diameterdouble = (double)diameter;
//Casts the int type variable into a double
    char inital = 's';
//char declaration: int name-of-variable = 'alphabetical-letter'
    boolean lie = true;
//boolean declaration: boolean name-of-variable = true or false
//Types of arithmetic operators in java: *-multiplication, /-division, +-addition, --subtraction, %-modulous division
    double sum1 = radius+pi;
    double sum2 = radius-pi;
    double sum3 = radius*pi;
    double sum4 = radius/pi;
    double sum5 = radius%pi;
//Arithmetic operators can only be completed if the two variables are of the same type
//Ex: double +-*/% double
//Ex: int +-*/% int
    System.out.println(diameterdouble);
    System.out.println(radius + " + " + pi + " = " + sum1);
    System.out.println(radius + " - " + pi + " = " + sum2);
    System.out.println(radius + " x " + pi + " = " + sum3);
    System.out.println(radius + " / " + pi + " = " + sum4);
    System.out.println(radius + " % " + pi + " = " + sum5);

  }
}
