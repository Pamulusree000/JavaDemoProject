package eclipsepracticepackage.java;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplebrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//it is used to scan the script and choose the browser
		Scanner sc=new Scanner("Chrome");
		String browser=sc.nextLine();
		
		
	//	String browser="Chrome";      we can use this method also
		
		WebDriver driver=null;
		//it is for open the chrome browser
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Automation Project\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox")) 
		{
			//it is for open the firefox browser
			System.setProperty("webdriver.gecko.driver", "E:\\Automation Project\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			//it is for no browser is given
			System.out.println("Invalid browser");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://sit.ivirtualvaidya.com/");
		Thread.sleep(3000);
		sc.close();
		driver.close();
	}

}
