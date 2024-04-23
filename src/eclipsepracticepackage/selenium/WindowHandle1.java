package eclipsepracticepackage.selenium;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//this is first window
		driver.get("https://omayo.blogspot.com/");
		//this is for second window
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> set=driver.getWindowHandles();
		
		Iterator<String> itr=set.iterator();
		
		String parentwindow = itr.next();
		
		
		while(itr.hasNext()) {
			String childwindow = itr.next();
			if(!parentwindow.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
				driver.close();
			}

		}
			driver.switchTo().window(parentwindow);
		
		String str=driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		
		System.out.println(str);

	}

}
