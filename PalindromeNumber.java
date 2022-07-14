package basicprogram;

import java.util.Scanner;

public class PalindromeNumber
{
	public static void main(String args[])
	   {
		   int num,temp,rem,reverse=0;
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter a number: ");
		   num=sc.nextInt();
		   
		   //storing the value for the future use
		   temp=num;
		   while(num>0)
		   {
			   rem=num%10;
			   reverse=(reverse*10)+rem;
			   num=num/10;
			   
		   }
		   
		   System.out.println("The reverse of the number "+temp  +" is: "+reverse);
		   
		   if(temp==reverse)
			   System.out.println("It is a Palindrome.");
		   else
			   System.out.println("It is not a Palindrome.");
		   
		   
	   }
			   
		      

}
