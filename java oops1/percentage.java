//Q-7
  import java.util.*;
 class Percentage
  {
   public static void main(String args[])
      {
       Scanner math = new Scanner(System.in);
      System.out.println("Enter the marks:");
       float   English=math.nextFloat();
       float  Math=math.nextFloat();
       float chemistry=math.nextFloat();
       float physics=math.nextFloat();
        float  IT=math.nextFloat();
       float marks;
       float sum=(Math+English+chemistry+physics+IT);
       marks =((sum/500)*100);
      System.out.println("percentage:"+"="+marks+"%");

       }
  }