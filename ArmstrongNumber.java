package basicprogram;

import java.util.Scanner;

public class ArmstrongNumber
{

	public static void main(String args[])
	{
		//variable declaration
		int num,count=0,sum=0,rem=0,temp;
		//taking input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		
		temp=num;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		
		num=temp;
		
		while(num>0)
		{
			rem=num%10;
			sum+=Math.pow(rem,count);
			num=num/10;
		}
		
		//checking actual number is matched with sum or not
		if(sum==temp)
		
			System.out.println(temp+ " is an armstrong number. ");
		else
			
			System.out.println(temp+ " is not an armstrong number. ");
	}
	
}
