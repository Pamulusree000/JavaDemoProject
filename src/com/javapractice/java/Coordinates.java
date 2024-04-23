package com.javapractice.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coordinates {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Project\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sit.ivirtualvaidya.com/");
		
		Location(driver);
		Dimensions(driver);
		Fontsize(driver);
		driver.close();
	
	}
	
	public static void Location(WebDriver driver)
	{
		
		
		Point p=driver.findElement(By.xpath("//span[text()=\"Sign-In\"]")).getLocation();
		
		int x=p.getX();
		int y=p.getY();
		
		System.out.println(x);
		System.out.println(y);
		
		
	}

	public static void Dimensions(WebDriver driver)
	{
		
		Dimension d=driver.findElement(By.xpath("//span[text()=\"Sign-Up\"]")).getSize();
		
		int h=d.getHeight();
		int w=d.getWidth();
		
		System.out.println(h);
		System.out.println(w);
		
	}
		
	public static void Fontsize(WebDriver driver)
	{
		
		driver.findElement(By.xpath("//span[text()=\"Sign-In\"]")).click();
		
		WebElement we=driver.findElement(By.id("txtMobNo"));
		
		String fs=we.getCssValue("font-size");
		System.out.println(fs);
		String fc=we.getCssValue("font-colour");
		System.out.println(fc);
		String ff=we.getCssValue("font-family");
		System.out.println(ff);
		
	
	}
	
	
	

	
}
