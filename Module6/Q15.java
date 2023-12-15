package Module6;
// WAP to demonstrate try catch block.
public class Q15 
{
	public static void main(String[] args) 
	{
		int a=8526;
		int b=0;
//		int c=a/b;
//		System.out.println(c);
		try 
		{
			int c=a/b;
		} catch (Exception e) 
		  {
			System.out.println("Print the Reason ");
			System.out.println(e);
		  }
		System.out.println("program is completed ");
	}
}
