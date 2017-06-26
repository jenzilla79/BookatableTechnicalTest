package FunctionalTests;


import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframetest {
	@Test
	public void testframes()
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://easyjet.com");
		
		List<WebElement> list = driver.findElementsByTagName("iframe");
		
		driver.switchTo().frame("tabco-iframe-1");
		driver.findElement(By.id("acDestinationAirport")).sendKeys("Germany");
					
		System.out.println("The no of iframes is "+list.size());
		
	}
}
