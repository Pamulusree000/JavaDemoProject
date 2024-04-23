package com.javapractice.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableMethod {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Project\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sit.ivirtualvaidya.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Enablebutton(driver);
		Displayed (driver);
		driver.close();
		
	}

	public static void Enablebutton(WebDriver driver)
	{
		
		WebElement button=driver.findElement(By.xpath("//span[text()=\"Sign-In\"]"));
		
		if (button.isEnabled()) {
			
			System.out.println("Login button is Enable");
		}
		else {
			
			System.out.println("Login button is not Enable");
		}
		
	
	}
	
	public static void Displayed (WebDriver driver)
	{
		
		WebElement button1=driver.findElement(By.xpath("//span[text()=\"Sign-In\"]"));
		
		if(button1.isDisplayed())
		{
			System.out.println("login button is visible");
		}else {
			
			System.out.println("Login button is not visible");
		}
	
		
		
	}
	
	
	
	
	
	
}
