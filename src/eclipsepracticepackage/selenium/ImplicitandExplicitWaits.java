package eclipsepracticepackage.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitandExplicitWaits {

	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,10);
				
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Facebook")));
		
		ele.click();
		
		
		
		
		
		
		
		
		

	}

}
