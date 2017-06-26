package FunctionalTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	private final WebDriver driver;
	
		public HomePage(WebDriver driver) 
		{
			this.driver = driver;
	    }

	        By addSvc = By.xpath("/html/body/div[2]/div[2]/ui-view/ui-view/div/div[1]/div/div[1]/div/a/span[1]");
        
	        WebElement mnuElement;
	        WebElement venueSettings;
	        WebElement services;
	        WebElement srvElement; 
	        		
	        public HomePage clickMenu() throws InterruptedException 
	        {        
		        mnuElement = driver.findElement(By.cssSelector("#nwt-global-navigation-v2 > nav > div.nwt-global-navigation-v2__bar > div > div.nwt-global-navigation-v2__home > a > span.nwt-global-navigation-v2__link-icon > span:nth-child(4)"));
		        venueSettings = driver.findElement(By.xpath("//*[@id='nwt-global-navigation-list']/li[2]/a/span"));
		        services = driver.findElement(By.xpath("//*[@id='nwt-global-navigation-list']/li[2]/ul/li[1]/a"));
		        
		        Actions builder = new Actions(driver);
		        // Move cursor to the Main Menu Element
		        builder.moveToElement(mnuElement).perform();
		        // Pause 2 Seconds for menu items to be displayed
				TimeUnit.SECONDS.sleep(2);       
		        // Clicking on the Hidden menu Elements
		        mnuElement.click();
		        TimeUnit.SECONDS.sleep(2);
		        venueSettings.click();
		        TimeUnit.SECONDS.sleep(2);
		        services.click();
		        return new HomePage(driver);  
	        }
	        
	        public HomePage clickAddService()
	        {
	        	driver.findElement(addSvc).click();
		       return new HomePage(driver);	
	        }
	        
	        public Boolean isAddServiceVisible()throws InterruptedException
	        {
	        	srvElement = driver.findElement(By.cssSelector("body > div.layout > div.ng-scope > ui-view > ui-view > div > div.settings__action-wrapper > div > div"));

	        	        boolean value = false;
	        	        if ((srvElement).isDisplayed())
	        	        		{
	        	            value = true;
	        	        }
	        	        return value;
	        }
	        
	        
	    }		
