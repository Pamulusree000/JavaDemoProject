package eclipsepracticepackage.java;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimentionslocations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open the browser
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Project\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//set the dimension of the browser
		Dimension d=new Dimension(1080,1080);
		driver.manage().window().setSize(d);
		
		//set the position of the browser
		Point p=new Point(200,300);
		driver.manage().window().setPosition(p);
		
		//to open the application url
		driver.get("https://sit.ivirtualvaidya.com/");
		
		
		
		
	
		
	}

}
