package com.javapractice.java;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserClass {
	
	static WebDriver driver =null;

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("browser?");
		
		String browser=s.nextLine();
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Automation Project\\chromedriver-win64\\chromedriver.exe");
			
			 driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Automation Project\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			
		 driver=new FirefoxDriver();
			
		}
		else 
		{
			System.out.println("Need to open the IE browser");
			
		}
		
		s.close();
		
		Startbrwser (driver);

	}
	
	public  static void Startbrwser (WebDriver driver)
	{
		
		driver.get("https://sit.ivirtualvaidya.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String st=driver.getTitle();
		
		System.out.println(st);
		
	}

}
