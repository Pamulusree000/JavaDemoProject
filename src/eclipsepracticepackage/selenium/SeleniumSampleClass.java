package eclipsepracticepackage.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumSampleClass {

	
	public static WebDriver driver;

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://sit.ivirtualvaidya.com/");
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//driver.close();
		driver.navigate().refresh();
		//String pagesource=driver.getPageSource();
		//System.out.println(pagesource);
		
		String text=driver.findElement(By.xpath("//span[text()='Sign-In']")).getText();
		System.out.println(text);
		WebElement pagedown=driver.findElement(By.xpath("//a[.='Cardiology']"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(false);", pagedown);
		Thread.sleep(2000);
	}

}
