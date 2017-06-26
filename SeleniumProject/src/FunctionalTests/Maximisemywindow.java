package FunctionalTests;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maximisemywindow {
	
	@Test
	public void test_maximise()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.youtube.com");
		
		driver.manage().window().maximize();
	}

}
