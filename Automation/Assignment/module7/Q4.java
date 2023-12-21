package module7;

/*
 W.A.J.script to register your self in Gmail.
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.getProperty("webdriver.chrome.driver","D:\\Selenium jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/&dsh=S-753952271:1702280074417293&ec=GAlAF"
				+ "w&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en-GB&service=mail&theme=glif&TL=AHNYTIT2YJxWyDEGgvFQ5-lg4Y_r1LG6ce3216Zwn-7HkA3YHu4rrbxH1YUAD5LQ");
		Thread.sleep(1500);
		
		driver.findElement(By.name("firstName")).sendKeys("Rishi");
		Thread.sleep(1500);
		driver.findElement(By.name("lastName")).sendKeys("Patel");
		Thread.sleep(1500);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.name("day")).sendKeys("18");
		Thread.sleep(1500);
		Select select=new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("October");
		Thread.sleep(1500);
		driver.findElement(By.id("year")).sendKeys("2001");
		Thread.sleep(1500);
		Select select2=new Select(driver.findElement(By.id("gender")));
		select2.selectByVisibleText("Male");
		Thread.sleep(1500);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.name("Username")).sendKeys("riship18102001");
		Thread.sleep(1500);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.name("Passwd")).sendKeys("rishirpatel1299");
		Thread.sleep(1500);
		driver.findElement(By.name("PasswdAgain")).sendKeys("rishirpatel1299");
		Thread.sleep(1500);
		driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe")).click();
		Thread.sleep(1500);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(1500);
		
		System.out.println("we cannot create account in google with automation tools");
		System.out.println("The error occurs of... 'Sorry, we could not create your Google Account.'");
	}
}
