package FunctionalTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class testsauceiphone {
	
	@Test
	public void testsauce() throws MalformedURLException
	{
		DesiredCapabilities caps = DesiredCapabilities.iphone();
		caps.setCapability("platform", "iOS");
		caps.setCapability("version", "8.1");
		WebDriver driver = new RemoteWebDriver(new URL("http://jenzilla:bf9a6950-36b6-4d80-94dd-b61976460d0e@ondemand.saucelabs.com:80/wd/hub"), caps);
		
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("jen@gmail.com");
	}

}
