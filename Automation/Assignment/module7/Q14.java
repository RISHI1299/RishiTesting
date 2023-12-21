package module7;

/*
 W.a. junit program to use parameterized demo with multiple
 parameter of Facebook login in junit.
*/

import java.sql.Driver;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Parameterized.class)
public class Q14 
{
	String password,username;
	
	public Q14(String username, String password)
	{
		this.username=username;
		this.password=password;
	}
	
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object[][] {{"9510847413","rishi@1299"},{"rishi@1299","rishi@1299"},{"rrpatel@1299","rishi1299"}});
	}
	WebDriver driver=null;
	@Before
	public void before() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jar\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1500);
	}
	
	@Test
	public void test() throws InterruptedException 
	{	
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(1500);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(1500);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	@After
	public void after()
	{
		driver.close();
	}
}
