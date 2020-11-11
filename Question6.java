
Q6. Program to show sum and average of 10 element array. Accept array elements from user.
import java.util.Scanner;
class Test
{
    public static void main(String[] args) 
    {
        int sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter all the elements:");
      	int[] a = new int[10];
        for(int i = 0; i < 10 ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / 10;
        System.out.println("Average:"+average);
    }
}