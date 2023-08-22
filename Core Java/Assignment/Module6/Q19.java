package Module6;

import java.util.ArrayList;
import java.util.ListIterator;

//WAP to iterate through all elements in an array list.
public class Q19 
{
	public static void main(String[] args) 
	{
		ArrayList <String> fruits=new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		System.out.println("My fav fruits are.."+fruits);
		System.out.println("Iterated");
		ListIterator<String> iterate=fruits.listIterator();
		while (iterate.hasNext()) 
		{
			System.out.println(iterate.next());
		}
	}
}