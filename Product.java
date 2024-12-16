import java.util.Scanner;
public class Product
{
 public static void main(String []args)
 {
  float num1,num2;
  Scanner in = new Scanner(System.in);
  System.out.println("Enter First number");
  num1=in.nextFloat();
  System.out.println("Enter Second number");
  num2=in.nextFloat();
  float prod=1;
  prod=num1*num2;
  System.out.println("The product of numbers is"+prod);
 }
}
  