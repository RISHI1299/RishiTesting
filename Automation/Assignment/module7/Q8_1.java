package module7;
/*
 W.A.J.Script To use Mouse and Keyboard event using Action class
 1.Mouse Hover Event
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;


public class Q8_1 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(1500);
		
		WebElement home=driver.findElement(By.linkText("Home"));
		WebElement vacations=driver.findElement(By.linkText("Vacations"));
		WebElement hotels=driver.findElement(By.linkText("Hotels"));
		
		Actions actions=new Actions(driver);
		Action a1=actions.moveToElement(vacations).build();
		a1.perform();
		Thread.sleep(1500);
		Action a2=actions.moveToElement(hotels).build();
		a2.perform();
		Thread.sleep(1500);
		Action a3=actions.moveToElement(home).build();
		a3.perform();
		driver.close();
	}
}
