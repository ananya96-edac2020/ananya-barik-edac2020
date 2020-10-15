//Q=13(B)
import java.util.*;
class Ternary
{
 public static void main(String args[])
  {
Scanner sc=new Scanner(System.in);
   int greater,comp;
System.out.println("Print the value of  a  b   c");
    int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();

    comp=a>b?a:b;
    greater=c>comp?c:comp;
    System.out.println("greater no is"+" = "+greater);
  }
}