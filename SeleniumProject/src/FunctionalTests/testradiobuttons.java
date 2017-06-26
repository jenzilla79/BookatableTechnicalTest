package FunctionalTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class testradiobuttons {
	@Test
	public void radiobuttontest() throws InterruptedException
	{
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://tfl.gov.uk/journeyplanner");
	//select
	driver.findElement(By.id("departing")).click();
	driver.findElement(By.id("arriving")).click();
	
	Assert.assertTrue(driver.findElement(By.id("arriving")).isSelected());
	Assert.assertFalse(driver.findElement(By.id("departing")).isSelected());
	}

}
