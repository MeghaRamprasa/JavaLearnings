package FrameworkExamples;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;



public class NewTest {
	
	@BeforeTest
	public void setUp() {
		 System.out.println("Before test");
	}
  @Test(priority = 0,enabled = false)
  public void firsttest() {
	  System.out.println("First test");
	  SoftAssert SA = new SoftAssert();
	  Assert.assertEquals(15, 15);
	  System.out.println("HardAssertPassed1");
	  SA.assertEquals(13, 11);
	  System.out.println("HardAssertPassed2");
	  System.out.println("We could still continue with soft assert");
  }
  
  @Test(priority = 2, groups = {"regression"}, dependsOnMethods = "thirdtest")
  public void secondtest() {
	  System.out.println("Second test");
  }

  @Test(priority = 3, groups = {"regression"})
  public void thirdtest() {
	  System.out.println("third test");
  }
  
  @Test(priority = 1)
  public void fourthtest() {
	  System.out.println("fourth test");
  }
  
	@AfterTest
	public void tearDown() {
		 System.out.println("After test");
	}

}
