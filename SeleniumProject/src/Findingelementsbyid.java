import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findingelementsbyid {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.thetrainline.com");
		//driver.findElement(By.id("originStation")).sendKeys("London");
		//driver.findElement(By.id("destinationStation")).sendKeys("Swansea");
		
		driver.findElement(By.name("OriginStation")).sendKeys("London");
		driver.findElement(By.name("DestinationStation")).sendKeys("Swansea");
	}

}
