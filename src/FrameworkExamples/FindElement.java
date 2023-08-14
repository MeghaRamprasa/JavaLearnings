package FrameworkExamples;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElement {
  @Test
  public void oneelement() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
	  WebDriver WD = new ChromeDriver();
	  String baseURL = "https://demo.guru99.com/test/ajax.html";
	  WD.get(baseURL);
	  WD.findElement(By.id("yes")).click();
	  WD.close();
  }
  
  @Test
  public void moreelement() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
	  WebDriver WD = new ChromeDriver();
	  String baseURL = "https://demo.guru99.com/test/ajax.html";
	  WD.get(baseURL);
	  List<WebElement> elements = WD.findElements(By.name("name"));
	  for(int i=0; i<elements.size();i++ )
	  {
		  System.out.println("Elements of the page: " + elements.get(i).getAttribute("value"));
	  }
	  WD.close();
  }
  
  @Test
  public void formhandling() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
	  WebDriver WD = new ChromeDriver();
	  String baseURL = "https://facebook.com";
	  WD.get(baseURL);
	  
	 WebElement emailID = WD.findElement(By.id("email"));
	 emailID.sendKeys("testing@gmail.com");
	  WD.findElement(By.id("pass")).sendKeys("Password");
	  //WD.findElement(By.xpath("//*[contains(@type='submit')]")).click();
	  WD.findElement(By.name("login")).click();
	  emailID.clear();
	//  WD.close();
	  
  }
 }
