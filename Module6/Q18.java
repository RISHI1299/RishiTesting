package Module6;

//WAP to create one thread by extending Thread class in another class.
class Second extends Thread
{
	public void run()//
	{
		for(int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("My first thread is.. "+i);
		}
		System.out.println("My first thread is completed..");
	}
}
public class Q18 
{
	public static void main(String[] args) 
	{
		Second f1=new Second();
		f1.start();
		for(int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("My main thread is.. "+i);
		}
		System.out.println("My main thread is completed..");
	}
}
