package FunctionalTests;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.Stopwatch;
import com.sun.jna.platform.win32.BaseTSD.SSIZE_T;

public class Stopwatchclass {
	@Test
	public void clientsidperformancestopwatch()
	{
		StopWatch s = new StopWatch();
				
		FirefoxDriver driver = new FirefoxDriver();
		
		s.start();
		
		driver.get("http://www.bbc.co.uk");
		
		s.stop();
		
		System.out.println(s.getTime()); //9517ms
	}

}
