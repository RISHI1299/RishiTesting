package module7;//doubt
/*
 W.A.J.Script To use Mouse and Keyboard event using Action class
 2.Keyboard Event
*/

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Q8_2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1500);
		
		WebElement s1=driver.findElement(By.id("email"));
		
		Actions act=new Actions(driver);
		Action a1=act.moveToElement(s1).click()
				.keyDown(s1,Keys.SHIFT)
				.sendKeys("Rishi")
				.keyUp(Keys.SHIFT)
				.pause(1000)
				.sendKeys(Keys.TAB)
				.pause(1000)
				.keyDown(Keys.SHIFT)
				.sendKeys("password")
				.keyUp(Keys.TAB)
				.pause(1000)
				.sendKeys(Keys.ENTER)
				.pause(2000)
				.build();
		a1.perform();
		Thread.sleep(1500);
		driver.close();
	}
}
