package Module6;

import java.util.Scanner;
//find factorial for given no.
public class Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. ");
		int a=sc.nextInt();
		int n=0;
		for (int i=1; i<=a; i++) 
		{
			n=n*i;
		}
		System.out.println(n);
	}
}
