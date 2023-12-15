package Module6;

//WAP to calculate the average value of array elements.

import java.util.Iterator;
import java.util.Scanner;

public class Q10 
{
	public static void main(String[] args) 
	{
		int c = 0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size..");
		int size=sc.nextInt();
		int[] b=new int[size];
		for (int i=0; i<size; i++) 
		{
			System.out.println("Enter the value..");
			b[i]=sc.nextInt();
		}
		for (int i=0; i<size; i++) 
		{
			System.out.print(b[i]+" ");
			sum=sum+b[i];
			c=sum/size;
		}
		System.out.println();
		System.out.println(sum);
		System.out.println(c);
	}
}
