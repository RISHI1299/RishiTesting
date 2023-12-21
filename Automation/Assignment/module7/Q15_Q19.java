package module7;

/*
 W.a. TestNG program to perform test with webdriver to login process of facebook
 w.a. TestNG program to create dataprovider.
*/

import org.testng.annotations.Test;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
public class Q15_Q19 
{
	WebDriver driver=null;
	@DataProvider(name="Rishi")
	public Object[][] input()
	{
		return new Object[][] {{"9510847413","124199"},{"rishi2001@gmail.com","rishi2001"},{"riship1299@gmil.com","rihsip2001"}};
	}
	
	@Test(dataProvider = "Rishi")
	public void loginbutton(String username,String password) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1500);
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(1500);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(1500);
		driver.findElement(By.name("login")).click();
		if (driver.getTitle().equals("(20+)Facebook")) 
		{
			System.out.println("Test has been Passed...");
		} 
		else 
		{
			System.out.println("Test gets failed..");
			fail("LoginButton failed");
		}
		driver.findElement(By.cssSelector("input[style=\"height:40px;width:40px\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("xu06os2 x1ok221b")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
}
