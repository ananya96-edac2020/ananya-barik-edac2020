
import java.util.Scanner;
class Marriage
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter your gender(M/F):");
   char gender =sc.next().charAt(0);
   System.out.println("Enter your age:");
   int age=sc.nextInt();
    if( gender=='M' &&  age>28){
    System.out.println("Eligible for marraige"); 
    }
   else if( gender=='F' && age>24)
    {
   System.out.println("Eligible for marriage");
    }
  else{
   System.out.println("Not Eligible for marraige");
  }
 }
 
}