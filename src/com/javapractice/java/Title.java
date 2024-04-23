package com.javapractice.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Project\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 driver.get("https://www.google.com/");
		 
		 String title=driver.getTitle();
		 
		 if(title.equals("Google"))
		 {
			 System.out.println("pass");
		 }
		 else {
			 
			 System.out.println("Fail");
		 }
	
		
	}

}
