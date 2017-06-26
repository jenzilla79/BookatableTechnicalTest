package FunctionalTests;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SeleniumJunit {

	FirefoxDriver driver; 
	// Pre conditions
	
	@Before
	public void SetUp()
	{
		driver = new FirefoxDriver();
	}
	
	//test cases with methods
	
	@Test
	public void openbbc()
	{
		driver.get("http://www.bbc.co.uk");
	}
	
	@Test
	public void opentrainline()
	{
		driver.get("http://www.thetrainline.com");
	}
	
	@Test
	public void opentfl()
	{
		driver.get("https://tfl.gov.uk/journeyplanner");
	}
	
	@Test
	public void testasserts()
	{
		//driver.get("https://tfl.gov.uk/journeyplanner");
		//Assert.assertEquals(expected, actual);
		Assert.assertNotSame(10, 20);
		//Assert.assertTrue(condition);
		//Assert.assertFalse(condition);
	}
	
	// Post conditions
	
		@After
		public void Teardown()
		{
			driver.quit();
		}
}
