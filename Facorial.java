package basicprogram;
import java.util.Scanner;

public class Facorial 
{
	public static void main(String args[])
    {
	 //variable declaration
   	 int num,i,fact=1;
   	 
   	 //taking the input from the user
   	 Scanner sc=new Scanner(System.in);
   	 System.out.println("Enter the number: ");
   	 num=sc.nextInt();
   	 
   	 for(i=1;i<=num;i++)
   	 {
   		 fact=fact*i;    //storing the calculated value in the variable fact
   		 
   	 }
   	 
   	 //displaying the result
   	 System.out.println("The factorial of "+num  +" is: "+fact);
    }
}
