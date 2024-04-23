package eclipsepracticepackage.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Actiondraganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "E:\\Automation Project\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://sit.ivirtualvaidya.com/");
		
		
		WebElement signin=driver.findElement(By.xpath("//span[text()=\"Sign-In\"]"));
		signin.click();
		
		//to find the locator for the username field
		WebElement txtusername =driver.findElement(By.id("txtMobNo"));
		
		txtusername.sendKeys("9874561321");
		//to find the locator for the password field
		WebElement txtpassword=driver.findElement(By.id("txtloginpwd"));
		
		txtpassword.sendKeys("Idea@12345");
		//to find the locator for the login button
		WebElement btnlogin =driver.findElement(By.id("btnLogin"));
		btnlogin.click();
		
		WebElement support =driver.findElement(By.xpath("//span[text()=\"Support\"]"));
		support.click();
		
		WebElement querywizard=driver.findElement(By.xpath("//span[text()=\"Query Wizard\"]"));
		querywizard.click();
		
		Actions a =new Actions(driver);
		
		WebElement tablenametext=driver.findElement(By.xpath("//th[text()=\"TableName\"]"));
		
		a.doubleClick(tablenametext).perform();
		
		Thread.sleep(3000);
		
		WebElement source = tablenametext;
		WebElement target = driver.findElement(By.id("txtQuery"));
		
		a.dragAndDrop(source, target).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
