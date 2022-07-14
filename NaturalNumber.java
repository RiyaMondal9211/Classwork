package basicprogram;
import java.util.Scanner;
public class NaturalNumber 
{
     public static void main(String args[])
     {
    	 //variable declaration
    	 int n,i,sum=0;
    	 
    	 //taking the range from the user
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the range: ");
    	 n=sc.nextInt();
    	 
    	 for(i=1;i<=n;i++)
    	 {
    		 sum=sum+i;     //storing the value in the variable sum 
    		 
    	 }
    	 
    	 //displaying the result
    	 System.out.println("The sum of natural numbers from 1 to "+n  +" is: "+sum);
     }
}
