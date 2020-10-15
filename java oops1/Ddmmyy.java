import java.util.*;
class Ddmmyy
{
   public static void main(String args[])
  {
    Scanner cal=new Scanner(System.in);
    System.out.println("Enter the value of total days given");
    int n=cal.nextInt();
    int year=n/365;
    int month=((n%365)/30);
    int day=((n%365)%30);
    System.out.println("year:"+year);
    System.out.println("month:"+month);
    System.out.println("day:"+day);
  
  }
 }