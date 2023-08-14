package com.facebook.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.facebook.pages.LoginPage;
import com.facebook.utils.BrowserCapabilities;

public class LoginTest {

	@Test
	public void testLogin() {
		
		WebDriver driver = BrowserCapabilities.browserProperties("https://www.facebook.com");
		LoginPage login = new LoginPage(driver);
		login.sendUsername("admin");
		System.out.println("Executed1");
		login.sendPassword("admin");
		System.out.println("Executed2");
		login.clickLogin();
		System.out.println("Executed3");
		
	}
}
