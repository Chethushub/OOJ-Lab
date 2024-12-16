import java.util.Scanner;

public class Qdeqn 
{
 public static void main(String[] args)
 {
  int a, b, c, d = 0;
  double r1, r2;
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the value of a: ");
  a = in.nextInt();
  System.out.println("Enter the value of b: ");
  b = in.nextInt();
  System.out.println("Enter the value of c: ");
  c = in.nextInt();
  d = b * b - 4 * a * c;
  if (d < 0)
  {
   System.out.println("There are no real solutions.");
  }
  else 
  {
   r1 = (-b + Math.sqrt(d)) / (2 * a);
   r2 = (-b - Math.sqrt(d)) / (2 * a);
   System.out.println("Root 1: " + r1);
   System.out.println("Root 2: " + r2);
  }
 }
}