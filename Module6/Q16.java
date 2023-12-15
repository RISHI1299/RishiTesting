package Module6;
// WAP to demonstrate multiple catch blocks
public class Q16 
{
	public static void main(String[] args) 
	{
		int a=8526;
		int b=2;
		int[] f=new int[5];
		try 
		{
			int c=a/b;
			System.out.println(c);
			System.out.println(f[2]);
			System.out.println(f[6]);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Print the Reason ");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException g)
		{
			System.out.println("Array Exception "+g);
		}
		catch(Exception e)
		{
			System.out.println("general exception "+e);
		}
	}
}
