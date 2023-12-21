package module7;

/*
 W.A.J.Script for Locating links by linkText() and partialLinkText()
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("A/B Testing")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.findElement(By.partialLinkText("A/B Test")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
