package basicprogram;

import java.util.*;

public class CountOddNumbers {

	public static void main(String args[]) {
		// variable declaration
		int n,i,count=0;
		
		//taking the range from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		n=sc.nextInt();
		
		//using for loop counting the odd numbers
		for(i=1;i<=n;i++) 
		{
			
			if(i%2!=0)
			{
				
				count++;  //count variable is used to count the odd numbers
				
			}
			
		}
		
		//displaying the result
		System.out.println("Total count of odd numbers: " +count);
	}
}
