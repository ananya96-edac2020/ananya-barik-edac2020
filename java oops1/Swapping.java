import java.util.*;
class Swapping
  {
     public static void main(String args[])
      {
       System.out.println("Enter the value of X and Y");
     Scanner sc= new Scanner(System.in);
       int X=sc.nextInt();
       int Y=sc.nextInt();
   System.out.println("before swapping no: "+ X +" "+ Y );
       X=X + Y; 
       Y=X -  Y;
       X=X - Y;
    System.out.println("After swapping:"+ X +" " + Y);
      }
  }
