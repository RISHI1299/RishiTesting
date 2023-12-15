package Module6;
/* W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It
has two subclasses each having a method with the same name
'message' that prints "This is first subclass" and "This is second
subclass" respectively.
Call the methods 'message' by creating an object for each subclass.*/

abstract class Parent
{
	public void message()
	{}
}
class firstsub extends Parent
{
	public void message()
	{
		System.out.println("This is First Subclass..");
	}
}
class secondsub extends Parent
{
	public void message()
	{
		System.out.println("This is Second Subclass..");
	}
}
public class Q25 
{
	public static void main(String[] args) 
	{
		Parent f=new firstsub();
		Parent s=new secondsub();
		f.message();
		s.message();
	}
}
