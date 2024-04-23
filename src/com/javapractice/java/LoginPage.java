package com.javapractice.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage   {
	

	private WebElement usernametextbox;
	private WebElement passwordtextbox;
	private WebElement loginbutton;
	
	public void loginloc(WebDriver driver)
	{
		usernametextbox=driver.findElement(By.id("txtMobNo"));
		passwordtextbox=driver.findElement(By.id("txtloginpwd"));
		loginbutton=driver.findElement(By.id("btnLogin"));
		
	}
	public void loginpara( ) {
		
		usernametextbox.sendKeys("8489784484");
		passwordtextbox.sendKeys("Idea@1234");
		loginbutton.click();
		
	}
	

}
