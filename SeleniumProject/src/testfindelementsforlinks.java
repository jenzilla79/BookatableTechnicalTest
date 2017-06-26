import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testfindelementsforlinks {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.bbc.co.uk/weather");
		//driver.get("https://www.google.co.uk/?gws_rd=ssl#q=best+holiday+destinations");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//List<WebElement> links = driver.findElements(By.xpath(".//*[@id='nav']/tbody/tr/td[3]/a"));
				
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getAttribute("href"));
		}

	}

}
