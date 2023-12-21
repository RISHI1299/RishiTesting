package module7;

/*
 W.A.J.Script To write a script for drop down.
 http://demo.guru99.com/test/newtours/register.php
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.findElement(By.name("country")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/"
				           + "td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option[108]")).click();
		Thread.sleep(1500);
		
		driver.close();
	}
}
