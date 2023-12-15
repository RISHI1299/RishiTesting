package Module6;

import java.util.ArrayList;

// WAP to update specific array element by given element.
public class Q20 
{
	public static void main(String[] args) 
	{
		System.out.println("Original array");
		ArrayList arr1=new ArrayList<>();
		arr1.add("Apple");
		arr1.add("Banana");
		arr1.add("Mango");
		arr1.add("Guava");
		arr1.add("Watermelon");
		System.out.println(arr1);
		
		System.out.println("After update of the Element of array ");
		arr1.set(3,"cherry");
		System.out.println(arr1);	
	}
}
