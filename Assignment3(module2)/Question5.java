Q5.Write a function which accepts a floating point number and counts the number of decimal places in the number without using a string. 
Input: 45.286 Output: 3 
Input: 3.14159 Output: 5
import java.util.*;
class Anu
{
   public static int num(double d){
      
       int count=0;
       while(d!=((int)d))
       {
         count++;
         d=d*10;
     }
    return count;
  }
   public static void main(String args[])
   {
    
       int n;
       n=num(45.286);
       System.out.println(n);
}
}