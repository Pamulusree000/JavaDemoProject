package eclipsepracticepackage.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Project\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://sit.ivirtualvaidya.com/");
		//declare the action class before the main url and pass the reference ex:driver in side the class
		Actions a =new Actions(driver);
		//create a webelement for sign button
		WebElement signin=driver.findElement(By.xpath("//span[text()=\"Sign-In\"]"));
		//this action is used to move to the sign button           (remember one thing if you dont give perform at the end of method it will not work)
		a.moveToElement(signin).perform();
		//this action is used to click on the button 
		a.click(signin).perform();
		
	
	}

}
