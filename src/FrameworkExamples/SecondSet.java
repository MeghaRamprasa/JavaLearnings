package FrameworkExamples;

import static org.testng.Assert.fail;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondSet {
	
	
  @Test(enabled=false)
  public void radiobutton() {
	 
	  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
		  WebDriver WD = new ChromeDriver();
		  String baseURL = "https://demo.guru99.com/test/radio.html";
		  WD.get(baseURL);
		 
		  List<WebElement> radios = WD.findElements(By.name("webform"));
		 // List<WebElement> radios=  WD.findElements(By.xpath("//*[@type='radio' AND @name='webform']"));
		  radios.get(1).click();
		  Assert.assertEquals(radios.get(1).isSelected(), true);
		  
		  radios.get(3).click();
		  radios.get(4).click();
		  radios.get(5).click();
		  Assert.assertEquals(radios.get(3).isSelected(), true);
		  Assert.assertEquals(radios.get(4).isSelected(), true);
		  Assert.assertEquals(radios.get(5).isSelected(), true);
		  
		  WD.close();
	  
  }
  
  @Test(enabled=false)
  public void links() {
		 
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
	  WebDriver WD = new ChromeDriver();
	  String baseURL = "https://demo.guru99.com/test/link.html";
	  //String baseURL = "https://www.qaautomated.com/p/form.html";
	  
	  WD.get(baseURL);
	 
//	  WD.findElement(By.partialLinkText("click")).click();
//	  System.out.println("Name of the page: " + WD.getTitle());
//	  
	  WD.findElement(By.linkText("click here")).click();
	  System.out.println("Name of the page: " + WD.getTitle());
	  
	 WD.close();
  
}
  
  @Test(enabled=false)
  public void mousehover() {
		 
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
	  WebDriver WD = new ChromeDriver();
	  String baseURL = "https://demo.guru99.com/test/tooltip.html";
	  WD.get(baseURL);
	
	  WebElement tooltip = WD.findElement(By.linkText("Download now"));
	  Actions hover = new Actions(WD);
	  
	  Action performing = hover
			  		.moveToElement(tooltip)
			  		.build();
	  
	  performing.perform();
	  
  }
  
  @Test(enabled=false)
  public void dropdown() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
	  WebDriver WD = new ChromeDriver();
	  String BaseURL = "https://www.saucedemo.com/";
	  WD.get(BaseURL);
	  
	  WD.findElement(By.id("user-name")).sendKeys("standard_user");
	  //WD.findElement(By.id("password")).sendKeys("secret_sauce");
	  WD.findElement(By.xpath("//*[@type='password']")).sendKeys("secret_sauce");
	  WD.findElement(By.name("login-button")).click();
	  
	  
	  Select drops = new Select(WD.findElement(By.className("product_sort_container")));
	  drops.selectByIndex(1);
	  
	  Select drops1 = new Select(WD.findElement(By.className("product_sort_container")));
	  drops1.selectByVisibleText("Price (low to high)");
	  
	  Select drops2 = new Select(WD.findElement(By.className("product_sort_container")));
	  drops2.selectByValue("hilo");
  }

  @Test(enabled=false)
  public void upload() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
	  WebDriver WD = new ChromeDriver();
	  String BaseURL = "https://demo.guru99.com/test/upload";
	  WD.get(BaseURL);
	  
	  WD.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\megha\\Documents\\Jump Statements.txt");
	  
	  WD.findElement(By.id("terms")).click();
	  WD.findElement(By.id("submitbutton")).click();
	 
  }
  
  @Test(enabled=false)
  public void alertpopupwindowhandling() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
	  WebDriver WD = new ChromeDriver();
	  String BaseURL = "https://www.qaautomated.com/p/alert.html";
	  WD.get(BaseURL);
	  
	  WD.findElement(By.id("mbtn")).click();
	  WD.switchTo().alert().accept();
	  WD.close();
  }
  
  @Test(enabled =false)
  public void tables() {
	  
	  DesiredCapabilities desired = new DesiredCapabilities();
	  //desired.setCapability("browser", ChromeDriver);
	  desired.setCapability("video", true);
	  desired.setCapability("console log", true);
	  desired.setBrowserName("Chrome");
	  desired.setCapability("Selenium Version", "4.9.0");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
	  WebDriver WD = new ChromeDriver();
	  String BaseURL = "https://www.qaautomated.com/p/table.html";
	  WD.get(BaseURL);
	  
	  System.out.println(WD.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText());
	  WD.close();
  }
  
  @Test
  public void brokenlinks() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Documents\\chromedriver_win32\\chromedriver.exe");
	  WebDriver WD = new ChromeDriver();
	  String BaseURL = "https://www.qaautomated.com/";
	  WD.get(BaseURL);
	  
	  List<WebElement> links = WD.findElements(By.tagName("a"));
	  
	  System.out.println("Number of links in this website is " +links.size());
	  
	  for(int i=0; i<links.size();i++)
	  {
		  WebElement Element1 = links.get(i);
		  String url = Element1.getAttribute("href");
		  verifyLinks(url);
	  }
	 
	  WD.close();
  }

private void verifyLinks(String Linkurl) {
		try {
			URL url = new URL(Linkurl);
			HttpURLConnection connector = (HttpURLConnection)url.openConnection();
			connector.setConnectTimeout(5000);
			connector.connect();
				if(connector.getResponseCode()>=400)
				{
					System.out.println(Linkurl+ " - " +connector.getResponseMessage()+ " - is a broken link");
				}
				else
				{
					System.out.println(Linkurl+ " = " + connector.getResponseMessage());
				}
		}
		catch(Exception ex){
			
		}
}


  
}
