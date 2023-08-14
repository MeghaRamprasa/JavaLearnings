package FrameworkExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Wait {
  @Test
  public void implicit() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
	  WebDriver WD = new ChromeDriver();
	  
	  String baseURL ="https://www.qaautomated.com/p/table.html";
	  WD.get(baseURL);
	  
	  WD.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	  WebElement String = WD.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
	  
	  String.isDisplayed();
	  String text = String.getText();
	  System.out.println("One" + text);
	  WD.close();
  }
  
  @Test
  public void explicit() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
	  WebDriver WD = new ChromeDriver();
	  
	  String baseURL ="https://www.qaautomated.com/p/table.html";
	  WD.get(baseURL);
	  
	  WebElement String = new WebDriverWait(WD, Duration.ofSeconds(100))
			  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table/tbody/tr[3]/td[1]")));
	   
	  String.isDisplayed();
	  String text = String.getText();
	  System.out.println("two" + text);
	  WD.close();
  }
  
  @Test
  public void fluent() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
	  WebDriver WD = new ChromeDriver();
	  
	  String baseURL ="https://www.qaautomated.com/p/table.html";
	  WD.get(baseURL);
	  
	  FluentWait<WebDriver> wait = new FluentWait<WebDriver>(WD)
			  .withTimeout(Duration.ofSeconds(60))
			  .pollingEvery(Duration.ofSeconds(5))
			  .ignoring(NoSuchElementException.class);
	  WebElement String = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table/tbody/tr[3]/td[3]")));
			  
	  
	  String.isDisplayed();
	  String text = String.getText();
	  System.out.println("three" + text);
	  WD.close();
  }
}
