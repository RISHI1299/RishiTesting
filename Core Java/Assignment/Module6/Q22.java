package Module6;
//WAP to Copy one array into another
public class Q22 
{
	public static void main(String[] args) 
	{
		int[]array1=new int[]{52,85,96,75,45};
		int[]array2=new int[array1.length];
		
		
		System.out.println("Array 1");
		for (int i=0;i<array1.length; i++) 
		{
			System.out.println(array1[i]);
			array2[i]=array1[i];
		}
		
		
		System.out.println("Array 2 copied from array1 ");
		for (int i=0; i<array2.length; i++) 
		{
			System.out.println(array2[i]);
		}
		
	}
}
