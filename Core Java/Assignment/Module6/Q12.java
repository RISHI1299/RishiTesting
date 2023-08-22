package Module6;

import java.util.Iterator;

// WAP to find the maximum and minimum value of an array.
public class Q12 
{
	public static void main(String[] args) 
	{
		int[] array= {5,8,9,6,3,2,4};
		int max=array[0];
		for (int i=0; i<array.length; i++) 
		{
			if (array[i]>max) 
			{
				max=array[i];
			}
		}
		System.out.println("maximum value is "+max);
		int min=array[0];
		for (int j=0; j< array.length; j++) 
		{
			if (array[j]<min) 
			{
				min=array[j];
			}
		}
		System.out.println("minimum value is "+min);
	
	}
}

