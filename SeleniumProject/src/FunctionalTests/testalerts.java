package FunctionalTests;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class testalerts {

	@Test
	public void alerttest() 
	{
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("website");
	
	//select a link which opens an alert
	driver.findElement(By.xpath("link on website")).click();
	
	Alert testalert = driver.switchTo().alert();
	
	// click on OK button on alert
	
	testalert.accept();
	
	// print text on alert box
	System.out.println(testalert.getText());
	
	//put in a variable
	String a = testalert.getText();
	
	// click on close x or cancel on alert
	
	testalert.dismiss();
	
	//validate alert text
	Assert.assertEquals("this is a test", a);

	}
}
