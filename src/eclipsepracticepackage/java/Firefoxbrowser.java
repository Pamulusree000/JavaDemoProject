package eclipsepracticepackage.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "E:\\Automation Project\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	}

}
