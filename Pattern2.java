package basicprogram;

import java.util.Scanner;

public class Pattern2
{

	public static void main(String args[])
	{
		int i,j,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		r=sc.nextInt();
		
		for(i=1;i<=r;i++)
		{
			for(j=i;j<=r;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
