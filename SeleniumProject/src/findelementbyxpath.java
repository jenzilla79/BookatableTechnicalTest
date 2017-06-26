import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findelementbyxpath {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		
		//Xpath partial path
		
		//tagname[@attributename = 'attribute value']
		//e.g.for gmail password it is: input[@type='password']
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");

		//CSS path, same as xpath but add cssSelector and remove double slash and @
		//CSS Selector is faster than xpath
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");

	}

}
