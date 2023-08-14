package FrameworkExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
	
  @Test
  public void testTile() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
	  WebDriver WD = new ChromeDriver();
	  String baseURL = "https://www.qaautomated.com";
	  WD.get(baseURL);
	  String actualtitle = WD.getTitle();
	  Assert.assertEquals(actualtitle, "QA Automated");
	  WD.close();
  }
}
