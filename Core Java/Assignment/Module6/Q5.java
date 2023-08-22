package Module6;

import java.util.Scanner;

public class Q5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no ");
		int n=sc.nextInt();
		int sum=0,copy=n,t;
		while(n>0)
		{
			t=n%10;
			sum=sum+(t*t*t);
			n=n/10;
		}
		if (copy==sum) 
		{
			System.out.println("The no is armstrong ");
		}
		else
		{
			System.out.println("The no is not armstrong ");
		}
	}
}
