package eclipsepracticepackage.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "E:\\Automation Project\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://sit.ivirtualvaidya.com/");
		//javascriptexecutor type casting give like this
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
	
		
		WebElement signin=driver.findElement(By.xpath("//span[text()=\"Sign-In\"]"));
		
		//by using the reference variable we can execute any webelement if you are not able to find by locators
		js.executeScript("arguments[0].click()", signin);
		
		
		
		
		
		
	}

}
