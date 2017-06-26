package FunctionalTests;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clientsideperformance {
	
	@Test
	public void performancetest()
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		
		Long starttime = System.currentTimeMillis();
		
		//open web page
		
		driver.get("http://www.bbc.co.uk");
		
		Long endtime = System.currentTimeMillis();
		
		System.out.println(endtime-starttime); //12262ms
	}

}
