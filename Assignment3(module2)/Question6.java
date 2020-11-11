Q6 Print the third-largest number in an array without sorting it Input: [ 24,54,31,16,82,45,67] Output: 54 (82 and 67 are the largest and second-largest)

public class Anu{  
public static int getThirdLargest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }
       System.out.println("Third Largest: "+a[total-3]+"  ("+a[total-1]+" "+"and"+" "+a[total-2]+"  are first and second largest no)");   
       return a[total-3]; 
        
}  
public static void main(String args[]){  
int a[]={1,2,5,6,3,2};  
//int b[]={24,54,31,16,82,45,67};  
//System.out.println("Third Largest: "+getThirdLargest(a,6));  
int n=getThirdLargest(a,6);
}
}