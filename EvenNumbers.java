package basicprogram;

import java.util.*;
public class EvenNumbers {
	
	public static void main(String args[]) {
		
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		n=sc.nextInt();
		
		System.out.println("The even numbers between 1 to "+n +" are: ");
		for(i=1;i<=n;i++) {
			
			if(i%2==0)
				System.out.println(i);
		}
	}

}
