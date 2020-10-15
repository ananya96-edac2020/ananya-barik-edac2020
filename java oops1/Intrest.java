import java.util.*;
class Intrest
{
  public static void main(String args[])
{
  Scanner math =new Scanner (System.in);
  System.out.println("Enter the value of P");
      int  P=math.nextInt();
  System.out.println("Enter the value of T");
      int T=math.nextInt();
  System.out.println("Enter the value of R");
      int R=math.nextInt();
      int SI;
  SI=((P*T*R)/100);
System.out.println("Enter the value of  Simple Interest:(P*T*R/100)"+" ="+SI);
  }

}