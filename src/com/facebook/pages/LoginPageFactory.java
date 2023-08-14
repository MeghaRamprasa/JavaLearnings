package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFactory {

		//WebDriver driver = new ChromeDriver();
		WebDriver driver;
		public LoginPageFactory(WebDriver driver) {
			this.driver = driver;
		}
		
		//@FindBy(id="email") WebElement email;
		@FindBy(how=How.ID,using="email")
		WebElement username;
		
		@FindBy(how=How.ID,using="pass")
		WebElement password;
		
		@FindBy(how=How.NAME,using="login")
		WebElement login;

		
		public void sendUsername(String name)
		{
			username.sendKeys(name);
		}
		
		public void sendPassword(String pass) {
			password.sendKeys(pass);
		}
		
		public void clickLogin() {
			login.click();
		}
}
