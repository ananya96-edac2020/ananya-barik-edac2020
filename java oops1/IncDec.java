//Q 3 (B)


import java.util.Scanner;
  class IncDec
    {
    
    public static void main(String args[])
    {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the value of x");
        int x= sc.nextInt();
        int y;
        y = x++ + ++x;
        System.out.println("value of y:"+y);
   }
  }


