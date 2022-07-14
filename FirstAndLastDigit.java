package basicprogram;

import java.util.*;

public class FirstAndLastDigit {

	public static void main(String args[])
	{
		
		int num,firstdigit=0,lastdigit=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		
		lastdigit=num%10;
		
		for(;num>0;)
		{
			firstdigit=num%10;
			num=num/10;
		}
		
	 System.out.println("First Digit is: "+ firstdigit);
	 System.out.println("Last Digit is: "+ lastdigit);
	 
	}
	
}
