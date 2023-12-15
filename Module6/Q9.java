package Module6;

//WAP to sum values of an array.

import java.util.Scanner;

public class Q9 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<5; i++) 
		{
			System.out.println("Enter the Value..");
			a[i]=sc.nextInt();
		}
		for (int i=0; i<5; i++) 
		{
			System.out.print(a[i]+" ");
			sum=sum+a[i];
		}
		System.out.println();
		System.out.println(sum);
	}
}
