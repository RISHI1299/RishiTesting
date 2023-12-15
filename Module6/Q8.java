package Module6;

// WAP to compute the sum of the first 100 prime numbers.

import java.util.Iterator;
import java.util.Scanner;

public class Q8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.  ");
		int a=sc.nextInt();
		int j,i,num,sum=0,z;
		for(j=1;j<=a;j++)
		{
			num=0;
			for ( i=1; i<=j; i++)
			{
				if(j%i==0)
				{
					num++;
				}	
			}
			if (num==2) 
			{	
				System.out.print(j+" ");
				sum=sum+j;	
			}	
		}
		System.out.println();
		System.out.print(sum);
	}
}
