package module7;

/*
 W.A.J. script to use different methods to manage the windows-alerts and pop ups.
*/

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3_3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]")).click();
		Thread.sleep(1500);
		
		Alert a1=driver.switchTo().alert();
		a1.sendKeys("Ris");
		a1.accept();
		Thread.sleep(1500);
		driver.close();
	}
}
