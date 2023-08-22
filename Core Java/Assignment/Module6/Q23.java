package Module6;
// WAP to reverse an array of integer values.
import java.util.ArrayList;

public class Q23 
{
	public static void main(String[] args) 
	{
		int[]a1= {85,92,73,54,65};
		for (int i=0; i<a1.length; i++) 
		{
			System.out.println(a1[i]);
		}
		System.out.println("In the Reverse order");
		for (int i=a1.length-1; i>=0; i--) 
		{
			System.out.println(a1[i]);
		}
	}
}
