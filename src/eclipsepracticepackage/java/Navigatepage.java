package eclipsepracticepackage.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Automation Project\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//it is used to maximize the window
		driver.manage().window().maximize();
		//it is used to delete all cookies
		driver.manage().deleteAllCookies();
		//it is used to delay the page 
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://sit.ivirtualvaidya.com/");
		//it is used to navigate forward
		driver.navigate().forward();
		driver.navigate().to("https://uat.techhealth.in/");
		//it is used to navigate backword
		driver.navigate().back();
		//it is used to close the browser
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
