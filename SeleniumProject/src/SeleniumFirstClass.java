import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();

			driver.get("http://www.bbc.co.uk");
			
			driver.navigate().to("http://www.youtube.com");
			driver.navigate().back();
	}
 
}
