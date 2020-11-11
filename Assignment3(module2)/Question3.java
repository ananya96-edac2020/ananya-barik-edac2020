Q3. Write a program which generates the series 1,4,27,16,125,36

 import java.util.Scanner;

class Program
   {
         void getSum(int n)
          {
               int c;
               int c1;
               for(int i=1;i<n;i++)
                 {
                     if(i%2==0){
                     c=i*i;
                     System.out.println(c);
                     }
                     else{
                     c1=i*i*i;
                      System.out.println(c1);
                   }
  }
}
}
class Hello
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     Program p=new Program();
     p.getSum(n);
   }
}