import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findelementbytagname {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.bbc.co.uk");
		
		driver.findElement(By.tagName("a")).click();
		

	}

}
