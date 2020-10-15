//Q=14
import java.util.*;
class LeapYear
{
    public static void main(String args[])
      {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of year:");
      int Y=sc.nextInt();
       if(Y%4==0)
        {
           System.out.println(Y +" "+is leap year");
         }
       else
       System.out.println(Y+" " +"is not a leap year");

   }
}