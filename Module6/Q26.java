package Module6;

import java.util.Scanner;
/*
W.A.J.P. which will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks
entered as below:
Marks Grade
91-100 AA
81-90 AB
71-80 BB
61-70 BC
51-60 CD
41-50 DD
<=40 Fail
*/
public class Q26 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks you got out of 100..");
		int marks=sc.nextInt();
		
		if (marks>=91 && marks<=100) 
		{
			System.out.println("Your Grade is AA..");
		} 
		else if (marks>=81 && marks<=90)
		{
			System.out.println("Your Grade is AB..");
		}
		else if (marks>=71 && marks<=80)
		{
			System.out.println("Your Grade is BB..");
		}
		else if (marks>=61 && marks<=70)
		{
			System.out.println("Your Grade is BC..");
		}
		else if (marks>=51 && marks<=60)
		{
			System.out.println("Your Grade is CD..");
		}
		else if (marks>=41 && marks<=50)
		{
			System.out.println("Your Grade is DD..");
		}
		else if (marks>=0 && marks<=40)
		{
			System.out.println("You are Fail..");
		}
		else
		{
			System.out.println("Please enter Valid marks in the range of 1 to 100..");
		}
	}
}
