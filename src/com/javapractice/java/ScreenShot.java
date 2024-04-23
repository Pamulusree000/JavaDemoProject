package com.javapractice.java;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShot {

	

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Project\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sit.ivirtualvaidya.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		Screeshotpage(driver);
		driver.close();
	
		
	}
	
	public static void Screeshotpage(WebDriver driver) throws IOException
	{
		
		EventFiringWebDriver e=new EventFiringWebDriver(driver);
		
		File  srcFile=e.getScreenshotAs(OutputType.FILE);
		File  desFile=new File("E:\\Automation Project\\homepage.jpg");
		
		Files.copy(srcFile, desFile);
		
	}
	
	
	
	
	
	
	
	
	

}
