
import java.util.*;
class welcome
{
public static void main(String args[])
 {
  Scanner wc=new Scanner(System.in);
  System.out.println("<Enter the name>");
   String S1=wc.nextLine();
   String S2="WELCOME";
   String S3=(S2+S1);
  System.out.println(S2+" "+"<"+S1+">");
}
}