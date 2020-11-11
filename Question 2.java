Q2.
 Write a program to reverse a given number.
import java.util.*;
class Test
{
         public static void main(String[] args) {
        int rev=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number: ");
	int num=sc.nextInt();
         while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
System.out.println("Reverse number: " + rev);
 }
}