package Module6;

import java.util.Scanner;

//WAP to concatenate a given string to the end of another string.
public class Q14 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String ");
		String s1=sc.nextLine();
		System.out.println("Enter Second String ");
		String s2=sc.nextLine();
		System.out.println("Enter Third String ");
		String s3=sc.nextLine();
		
		System.out.println("Concate two string  ");
		System.out.println(s1+" "+s2);
		
		String s4=s1.concat(" dog");
		System.out.println(s4);
		 
		String s5=s1.concat(s2);
		System.out.println(s5);
	}
}
