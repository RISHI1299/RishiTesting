package Module6;

import java.util.Iterator;
import java.util.Scanner;

public class Q4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no. ");
		int n=sc.nextInt();
		int i,num=0;
		for ( i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				num++;
			}	
		}
		if (num==2) 
		{
			System.out.println(n+" is prime no.");
		}
		else
		{
			System.out.println(n+" is not prime no.");
		}
	}
}
