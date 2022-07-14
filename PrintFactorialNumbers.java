package basicprogram;


public class PrintFactorialNumbers
{
	public static void main(String args[])
    {
	 //variable declaration
   	 int i;
   	 float fact=1;
   	 
   	 for(i=1;i<=10;i++)
   	 {
   		 fact=fact*i;    //storing the calculated value in the variable fact
   		 
   		System.out.println("The factorial of "+i  +" is: " +fact);
   	 }
   	 
   	 
    }
}
