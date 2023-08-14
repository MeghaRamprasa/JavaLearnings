package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//WebDriver driver = new ChromeDriver();
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.id("email");
	By password = By.id("pass");
	By login = By.name("login");
	
	public void sendUsername(String name)
	{
		driver.findElement(username).sendKeys(name);
	}
	
	public void sendPassword(String pass) {
		driver.findElement(password);
	}
	
	public void clickLogin() {
		driver.findElement(login).click();
	}

}
