package eclipsepracticepackage.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectStatement {

	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		
		//here we have to use select statement if tag in the html code have select only
		//create a webelement for the select tag
		WebElement dropdown=driver.findElement(By.id("drop1"));
		
		//create the object for the select 
		Select sec=new Select(dropdown);
		
		//use the object reference to select the element
		sec.selectByVisibleText("doc 2");
		
		
		
		
		
		
		
	}

}
