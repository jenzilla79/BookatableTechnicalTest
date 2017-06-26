package FunctionalTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class testdropdowns {

	@Test
	public void radiobuttontest() throws InterruptedException
	{
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://tfl.gov.uk/journeyplanner");
	//select
	Select dropdown = new Select(driver.findElement(By.id("Date")));
	
	dropdown.selectByVisibleText("Thu 17 Sep");
	
	String txt = dropdown.getFirstSelectedOption().getText();
	
	Assert.assertEquals(txt, "Thu 17 Sep");
	//Assert.assertTrue(driver.findElement(By.id("arriving")).isSelected());

	}
}
