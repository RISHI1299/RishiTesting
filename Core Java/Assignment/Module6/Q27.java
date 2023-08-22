package Module6;

import java.util.Scanner;

class RishiException extends Exception
{
	double amount;
	public RishiException(double amount)
	{
		this.amount=amount;
	}
}
class ATM
{
	double balance;
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println(amount+"rs deposite...");
	}
	public void withdrawal(double amount)throws RishiException
	{
		if(amount<=balance)
		{
			balance -= amount;
			System.out.println(amount+"rs withdrawal sucessfully..");
		}
		else
		{
			double needs=amount - balance;
			throw new RishiException(needs);
		}
	}
}

public class Q27 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ATM a1=new ATM();
		System.out.println("Enter the amount of deposit..");
		double amount=sc.nextDouble();
		a1.deposit(amount);
		
		System.out.println("Enter amount for withdeawal..");
		amount=sc.nextDouble();
		try
		{
			a1.withdrawal(amount);
		}catch(RishiException e)
		{
			System.out.println("If your enter"+e.amount+"rs more into your account then you withdrawl"+amount+"rs");
		}
	}
}
