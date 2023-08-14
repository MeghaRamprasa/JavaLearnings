package FrameworkExamples;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class AdvancedSelenium {
  @Test(enabled=false)
  public void newWindow() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
	  WebDriver WD = new ChromeDriver();
	  WD.get("https://www.qaautomated.com/");
	  
	  String newtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
	  
	  WD.findElement(By.xpath("//a[text()='About']")).sendKeys(newtab);
	  WD.quit();
  }


	@Test(enabled=false)
	public void navigateTowindow() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
		  WebDriver WD = new ChromeDriver();
		  WD.get("https://www.qaautomated.com/");
		  
		  String newtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		  
		  WD.findElement(By.xpath("//a[text()='About']")).sendKeys(newtab);
		  
		  ArrayList<String> tabs = new ArrayList<String>(WD.getWindowHandles());
		  WD.switchTo().window(tabs.get(1));
		  
		  System.out.println("Tile of the page is " +WD.getTitle() + " " + tabs.get(1));
		  WD.switchTo().window(tabs.get(0));
		  
		  System.out.println("Tile of the page is " +WD.getTitle() + " Parent window - " + tabs.get(0));
		  WD.close();
		  WD.quit();
		  
	}
	
	@Test(enabled=false)
	public void takescreenshot() throws Exception {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
		  WebDriver WD = new ChromeDriver();
		  WD.get("https://www.qaautomated.com/");
		  
		  this.takeSnapShot(WD,"C:\\Users\\megha\\LearningWorkSpace\\HelloWorldLearn\\Screenshots\\test.png");
		  WD.quit();
	}

	private void takeSnapShot(WebDriver WebDriver, String FileWithPath) throws Exception {
		TakesScreenshot scrShot = ((TakesScreenshot)WebDriver);
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(FileWithPath);
		Files.copy(scrFile, DestFile);
		
	}
	
	@Test
	public void scrrollTo()  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
		  WebDriver WD = new ChromeDriver();
		  WD.get("https://www.qaautomated.com/p/table.html");
		  WD.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  WebElement scrollTo = WD.findElement(By.id("comments"));
		  ((JavascriptExecutor)WD).executeScript("arguments[0].scrollIntoView(true)", scrollTo);
	}
}


 