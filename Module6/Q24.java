package Module6;
// WAP to find the second largest element in an array.
public class Q24 
{
	public static void main(String[] args) 
	{
		int temp;
		int a[]=new int[] {45,95,85,75,65,25,55};
		{
			for (int i=0; i<a.length; i++) 
			{
				for (int j=i+1; j<a.length; j++) 
				{
					if (a[i]<a[j]) 
					{ 
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("The sorted array..");
			for (int i=0; i<a.length; i++) 
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
			System.out.println("The Second largest element is.."+a[1]);
			System.out.println("The Second smallest element is.."+a[5]);
		}
	}
}
