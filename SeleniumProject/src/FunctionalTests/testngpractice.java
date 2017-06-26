package FunctionalTests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testngpractice {
	
	FirefoxDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		//System.out.println("set up");
		driver = new FirefoxDriver();
	}
	
	@AfterMethod
	public void teardown()
	{
		//System.out.println("tear down");
		driver.quit();
	}
	
	@Test
	public void sampletest1()
	{
		driver.get("http://www.bbc.co.uk");
	}

	@Test
	public void sampletest2()
	{
		driver.get("http://www.easyjet.com");
	}
	
	
	@Test
	public void sampletest3()
	{
		driver.get("http://www.thetrainline.com");
	}

	
}
