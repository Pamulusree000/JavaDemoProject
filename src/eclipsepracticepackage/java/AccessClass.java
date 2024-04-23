package eclipsepracticepackage.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//objectcreation class object used here to access non static variables 
		ObjectCreation obj=new ObjectCreation();
		
		
		System.out.println(obj.age);
		System.out.println(obj.name);
		
		obj.age=30;
		obj.name="kumar";
		
		System.out.println(obj.age);
		System.out.println(obj.name);
		
	
		
		WebDriver driver =new ChromeDriver();
		
		driver.findElement(By.xpath(null)).sendKeys(Keys.ENTER);
		
		
	WebElement	btn= driver.findElement(By.id("btnLogin"));
	
	
	String s=btn.getAttribute("btnlogin");
	
	System.out.println(s);
	
	
	
		
		
	}

}
