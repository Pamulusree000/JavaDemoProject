package eclipsepracticepackage.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//to open the chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Project\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://sit.ivirtualvaidya.com/");
		
		
		//to get the title of the page
		String title=driver.getTitle();
		System.out.println(title);
		
		//to get the current url of the page
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement signin =driver.findElement(By.xpath("//span[text()=\"Sign-In\"]"));
		
		signin.click();
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
