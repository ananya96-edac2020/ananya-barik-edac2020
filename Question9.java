Q9. Write a program to search an element in the array.

import java.util.Scanner;  
class Test
{  
  public static void main(String args[])  
  {  
    int c, n, search, array[];  
   
    Scanner in = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = in.nextInt();   
    array = new int[n];  
   
    System.out.println("enter array elements: ");  
   
    for (c = 0; c < n; c++)  
      array[c] = in.nextInt();  
   
    System.out.println("Enter elements to find");  
    search = in.nextInt();  
   
    for (c = 0; c < n; c++)  
    {  
      if (array[c] == search)   
      {  
         System.out.println(search + "  element is present at location " + (c + 1));  
          break;  
      }  
   }  
   if (c == n)
      System.out.println(search + " isn't present in array.");  
  }  
}  