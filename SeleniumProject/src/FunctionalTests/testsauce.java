package FunctionalTests;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class testsauce {
	
	
	@Test
	public void testsauce() throws MalformedURLException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 7");
		caps.setCapability("version", "38.0");
		WebDriver driver = new RemoteWebDriver(new URL("http://jenzilla:bf9a6950-36b6-4d80-94dd-b61976460d0e@ondemand.saucelabs.com:80/wd/hub"), caps);
		
		driver.get("http://www.thetrainline.com");
		driver.findElement(By.id("originStation")).sendKeys("London");
	}

}
