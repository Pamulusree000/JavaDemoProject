package eclipsepracticepackage.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	
	public static WebDriver driver;

	public static  void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		
		frames();
	}	
		
	
	
	public static String frames() throws InterruptedException
	{
		
		WebElement ma=driver.findElement(By.id("main"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(false);", ma);
		
		WebElement frame =driver.findElement(By.id("iframe2"));
		driver.switchTo().frame(frame);
		
		Thread.sleep(5000);

		WebElement sample =driver.findElement(By.xpath("//p[contains(text(),'Please try again in 30 seconds.')]"));
		return sample.getText();
	}
	

}
