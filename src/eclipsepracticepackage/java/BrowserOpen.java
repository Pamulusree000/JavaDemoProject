package eclipsepracticepackage.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		//browser driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Project\\chromedriver-win64\\chromedriver.exe");
		//To open the chromebrowser
		WebDriver driver=new ChromeDriver();     // webdriver is interface,driver is reference variable,new is keyword,chromedriver() is constructor
		//To maxmize the browser
		driver.manage().window().maximize();
		//To the application url
		driver.get("https://sit.ivirtualvaidya.com/");
		//delay the time
		Thread.sleep(3000);
		//To close the window
		driver.close();
	
	}

}
