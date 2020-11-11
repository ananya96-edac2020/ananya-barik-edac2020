module 2:
//Q1 Write a program to print table of any entered number using loop.
import java.util.*;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
		System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
}
