package eclipsepracticepackage.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tileandcurrenturl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Project\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sit.ivirtualvaidya.com/");
		//to get title of the page
		String title=driver.getTitle();
		
		if(title.equals("Smart Virtual Clinic")) {
			//If title is correct this will execute
			System.out.println("pass:title is Smart Virtual Clinic");
			
		}
		else {
			//If title is not correct this will execute
			System.out.println("fail:title is not Smart Virtual Clinic");
		}
	
		String url=driver.getCurrentUrl();
		
		if(url.equals("https://sit.ivirtualvaidya.com/"))
		
		{
			//If current url is correct this will execute
			System.out.println("pass:url is correct");
		}
		else {
			//If current url is not correct this will execute
			System.out.println("fail:url is not correct");
		}
		
	}

	
	
	
}
