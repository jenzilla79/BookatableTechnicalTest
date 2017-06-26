package FunctionalTests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class testscreenshot {

	@Test
	public void radiobuttontest() throws InterruptedException, IOException
	{
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://tfl.gov.uk/journeyplanner");
	//select
	Select dropdown = new Select(driver.findElement(By.id("Date")));
	
	dropdown.selectByVisibleText("Thu 17 Sep");
	
	String txt = dropdown.getFirstSelectedOption().getText();
	
	// Take a screenshot of current page
	File srcFile = 
			((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile,  new File ("C:\\Automation0509\\screenshot.png"));
	
	//compare actual text with expected text
	Assert.assertEquals(txt, "Thu 17 Sep");

	}
}
