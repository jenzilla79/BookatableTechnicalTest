package FunctionalTests;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class dynamicxpath {
	
	@Test
	public void dynamicxpath()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.yahoo.com");;
		
		driver.findElement(By.id("UHSearchBox")).sendKeys("world");
		List<WebElement> list= driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_12_0_1_14')]/a"));
		
		//list.get(2).click();
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getText());
			/*if((list.get(i).getText()).equalsIgnoreCase("world cup"))
			{
				list.get(i).click();
			}*/
		}
		
	}

}
