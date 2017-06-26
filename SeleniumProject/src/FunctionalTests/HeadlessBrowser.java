package FunctionalTests;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HeadlessBrowser {

	@Test
	public void headlesstest()
	{
		//FirefoxDriver driver = new FirefoxDriver(); //21.269s
		
		//HtmlUnitDriver driver = new HtmlUnitDriver(); //2.788s
		System.setProperty("phantomjs.binary.path", "C:\\Automation0509\\phantomjs-2.0.0-windows");
		PhantomJSDriver driver = new PhantomJSDriver(); //3.725s
		driver.get("http://www.bbc.co.uk");
	}
}
