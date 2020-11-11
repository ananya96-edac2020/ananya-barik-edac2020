Q2.Write a program which takes an array of integers and prints the running average of 3 consecutive integers. In case the array has fewer than 3 integers, there should be no output. Input: [5,14,35,89,140] Output: [18, 46, 88] (Explanation: 18=(5+14+35/3, 46=(14+35+89)/3, ...)
import java.util.Scanner;
class Three
{
    void getSum(int a1[],int n1)
     {
         for(int i=0;i<n1;i++)
          { 
              int sum;
              sum=(a1[i]+a1[i+1]+a1[i+2])/3; 
              System.out.println(sum);  
          }
     }
}
class Hello
{ 
    public static void main(String args[])
    {  
      Scanner sc=new Scanner(System.in);
      Three t1=new Three();
      System.out.println("Enter size");
      int n1=sc.nextInt();
      int a1[]=new int[n1];
      for(int i=0;i<n1;i++)
      {
        a1[i]=sc.nextInt()
}
     t1.getSum(a1,n1);
    }
    }