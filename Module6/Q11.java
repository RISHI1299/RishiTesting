package Module6;
// WAP to find the index of an array element.
public class Q11 
{
	public static void main(String[] args) 
	{
		int[] array= {5,6,8,3,7,1,4};
		int index=0;
		for (int i=0; i<array.length; i++) 
		{
			if (array[i]==4) 
			{
				index=i;
			}
		}
		System.out.println("index="+index);
	//int element=3;
    //int index=array.indexOf(element);
	//System.out.println(index);
	}
}
