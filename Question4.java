Q4. Calculate  series : 12+22+32+42+.........+n2

import java.util.*;
class Test
{   
    	public static void main( String[] args ) 
    	{
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter last digit: ");
		int n=sc.nextInt();
		for(i=12;i<=n;i=i+10)
		{
			sum = sum + i;
		}
		System.out.println("Sum is : " +sum);
    	}
}