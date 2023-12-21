package module7;

/*
 Q9-W.A.J. Script How to handled Alert in selenium
 "http://demo.guru99.com/test/delete_customer.php "
*/

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1500);
		
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Rishi");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[name=\"submit\"]")).click();
		Thread.sleep(1500);
		
		Alert a1=driver.switchTo().alert();
		a1.accept();
		a1.accept();
		Thread.sleep(1500);
		
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Rishi");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[name=\"submit\"]")).click();
		Thread.sleep(1500);
		
		a1.dismiss();
		Thread.sleep(1500);
		driver.close();
	}
}
