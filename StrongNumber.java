package basicprogram;

import java.util.Scanner;

public class StrongNumber 
{

	public static void main(String args[])
	{
		int num,i,fact=1,rem=0,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
		    fact=1;
		
		for(i=1;i<=rem;i++)
		{
			
			fact=fact*i;
		
         }
		sum=sum+fact;
		num=num/10;
		}
		if(sum==temp)
			System.out.println(temp+" is a strong number ");
		else
			System.out.println(temp+" is not a strong number ");
		
	}
	
}
