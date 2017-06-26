import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findelementsbylinktext {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.bbc.co.uk");
		
		// Identify link Sport
		
		driver.findElement(By.linkText("Sport")).click();
		
		// Partial link elements
		
		driver.findElement(By.partialLinkText("iPL")).click();
		
		
	}

}
