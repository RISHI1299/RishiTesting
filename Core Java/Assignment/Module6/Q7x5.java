package Module6;
/*
    *
  * * *
* * * * *
  * * *
    *
*/
public class Q7x5 
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=4; i++) 
		{
			for (int j=1; j<=4-i; j++) 
			{
				System.out.print(" ");
			}
			for (int j=1; j<=i;j++) 
			{
				System.out.print(" "+"*");
			}
			System.out.println();
		}
		for (int i=3; i>=1; i--) 
		{
			for (int j=1; j>=i-2; j--) 
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++) 
			{
				System.out.print(" "+"*");
			}
		System.out.println();
		}
	}
}
