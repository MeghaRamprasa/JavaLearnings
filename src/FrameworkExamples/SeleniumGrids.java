package FrameworkExamples;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrids {
  @Test
  public void launchOnVM() throws MalformedURLException {
	  
	  ChromeOptions browserOptions = new ChromeOptions();
	  browserOptions.setPlatformName("Windows 11");
	  browserOptions.setBrowserVersion("114.0");
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.59/6575"), browserOptions);
	  
	  driver.get("http://www.google.com");
	  driver.quit();
	  System.out.println("Executed");
	  
	 
	 
	}
  
}
