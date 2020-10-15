//Q=13(A)
import java.util.*;
class Greater
{
public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of X");
      int X=sc.nextInt();
      System.out.println("Enter the value of Y");
      int Y=sc.nextInt();
      System.out.println("Enter the value of Z");
      int Z=sc.nextInt();
      if (X>Y   &&    X>Z )
        System.out.println("X is greater");
      else if (  Y>X   &&  Y>Z   )
       System.out.println("Y is greater");
      else 
         System.out.println("Z is greater among all");

     }
 
 }