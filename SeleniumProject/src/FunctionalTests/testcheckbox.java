package FunctionalTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class testcheckbox {

	@Test
	public void checkboxtest() throws InterruptedException
	{
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.thetrainline.com");
	//select
	driver.findElement(By.id("isOpenReturn")).click();
	driver.findElement(By.id("isOneWay")).click();
	
	Thread.sleep(10000);
	//de-select
	driver.findElement(By.id("isOneWay")).click();
	
	Assert.assertFalse(driver.findElement(By.id("isOneWay")).isSelected());
	}
	
}
