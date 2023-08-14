package com.facebook.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.facebook.pages.LoginPageFactory;
import com.facebook.utils.BrowserCapabilities;

public class LoginTestPageFactory {


	@Test
	public void testLogin() {
		
		WebDriver driver = BrowserCapabilities.browserProperties("https://www.facebook.com");
		LoginPageFactory login = PageFactory.initElements(driver, LoginPageFactory.class);
		login.sendUsername("admin");
		System.out.println("Executed1");
		login.sendPassword("admin");
		System.out.println("Executed2");
		login.clickLogin();
		System.out.println("Executed3");
		
	}
}
