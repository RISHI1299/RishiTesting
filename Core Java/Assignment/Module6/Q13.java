package Module6;
// WAP to Compare Two String.
public class Q13 
{
	public static void main(String[] args) 
	{
		String a="Rishi";
		String b=new String("Rishi");
		String c=new String("rishi");
		System.out.println("Using doube equls     "+(a==b));
		System.out.println("Using equal()       "+a.equals(b));
		System.out.println("This is case sensitive        "+b.equals(c));
		System.out.println("This is not case sensitive     "+b.equalsIgnoreCase(c));	
		System.out.println("compare a and b using compareTo     "+a.compareTo(b));
		System.out.println("compare a and c using compareTo     "+a.compareTo(c));
		System.out.println("compare b and c using compareTo     "+b.compareTo(c));
	}
}
