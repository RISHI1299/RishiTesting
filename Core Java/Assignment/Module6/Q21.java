package Module6;
// WAP to remove the third element from a array list.
import java.util.ArrayList;

public class Q21 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		System.out.println("Default size is.."+a1.size());
		System.out.println("Default Value is.."+a1);
		a1.add(123);
		a1.add('R');
		a1.add(85.26f);
		a1.add("Rishi");
		a1.add(new Integer(100));
		a1.add("Rishi");
		System.out.println("All the array.."+a1);
		
		a1.remove(3);
		System.out.println("After removal.."+a1);
		
	}
}
