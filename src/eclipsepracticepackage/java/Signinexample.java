package eclipsepracticepackage.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signinexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Project\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://sit.ivirtualvaidya.com/");
		
		//to find the locator for the signin button
		WebElement signin =driver.findElement(By.xpath("//span[text()=\"Sign-In\"]"));
		
		signin.click();
		//to find the locator for the username field
		WebElement txtusername =driver.findElement(By.id("txtMobNo"));
		
		txtusername.sendKeys("6171617161");
		//to find the locator for the password field
		WebElement txtpassword=driver.findElement(By.id("txtloginpwd"));
		
		txtpassword.sendKeys("Idea@123");
		//to find the locator for the login button
		WebElement btnlogin =driver.findElement(By.id("btnLogin"));
		
		String logintext =btnlogin.getText();
		
		System.out.println(logintext);
		
		
		
		
		
		
		btnlogin.click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
