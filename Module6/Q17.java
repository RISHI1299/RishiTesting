package Module6;
//WAP to create one thread by implementing Runnable interface in class.

class First implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(2000);
			} catch (Exception e) 
			{
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("My first thread is..."+i);
		}
		System.out.println("My first thread is completed..");
	}
	
}
public class Q17 
{
	public static void main(String[] args) 
	{
		First s1=new First();
		Thread t1=new Thread(s1);
		t1.start();
		for(int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(2000);
			} catch (Exception e) 
			{
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("My main thread is..."+i);	
		}
		System.out.println("my main thread is completed..");
	}
}
