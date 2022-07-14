package basicprogram;
import java.util.*;
public class PerfectNumber 
{

	public static void main(String args[]) 
	{
		
		int num,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		
		for(i=1;i<num;i++) 
		{
			
			if(num%i==0) 
			{
				
				sum=sum+i;
			}
		}
		
		if(num==sum) 
		{
			System.out.println(num+" is a perfect number");
			
		}
		else
			System.out.println(num+" is not a perfect number");
		
	}
}
