import java.util.*;
class Temp
{
public static void main(String args[])
{
Scanner temp=new Scanner(System.in);
System.out.println("Enter the temperature in fahrenheit");

  int f =temp.nextInt( );
  int C=(5*(f-32)/9);
 System.out.println("the converted temperature in celcius is:"+C+" "+"degree celcius");
}
 
}