package eclipsepracticepackage.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	
	public static WebDriver driver;
	
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> list =driver.findElements(By.xpath("//div[@id='LinkList1']/div/ul/li"));
		
		for (Integer  i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
