package module7;

/*
 W.a. junit program to perform test with webdriver to login process of
 facebook
*/

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12 
{
	WebDriver driver;
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
		driver.findElement(By.id("email")).sendKeys("rishi");
		Thread.sleep(500);
		driver.findElement(By.id("pass")).sendKeys("rishipatel");
		Thread.sleep(500);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
	
	@After
	public void after() throws InterruptedException
	{
		driver.close();
	}
}
