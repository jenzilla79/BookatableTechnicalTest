package FunctionalTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SettingsPage {

	private final WebDriver driver;

    public SettingsPage(WebDriver driver) {
        this.driver = driver;

        // Check that we're on the right page.
        if (!"Settings".equals(driver.getTitle())) {
            throw new IllegalStateException("This is not the Settings page");
        }
    }

        By serviceName = By.xpath("//*[@id='label']");
        
        WebElement startTimeHrs; //= driver.findElement(By.id("startTimeHours"));
        //Select dropdownHrs = new Select(startTimeHrs);
        WebElement startTimeMins; //= this.driver.findElement(By.id("startTimeMins"));
        //Select dropdownMins = new Select(startTimeMins);        

        WebElement endTimeHrs; //= this.driver.findElement(By.id("endTimeHours"));
        //Select dropdownEHrs = new Select(endTimeHrs);
        WebElement endTimeMins; //= this.driver.findElement(By.id("endTimeMins"));
        //Select dropdownEMins = new Select(endTimeMins);        
        
        WebElement bookFreq; //= this.driver.findElement(By.id("timeslotInterval"));
        //Select dropdownBkFreq = new Select(bookFreq);
        
        By repeatAll = By.xpath("/html/body/div[2]/div[2]/ui-view/ui-view/div/div[2]/div/div/div/shift-details/form/div[4]/fieldset/select-week-days/div/input[1]");
        By submit = By.xpath("/html/body/div[2]/div[2]/ui-view/ui-view/div/div[2]/div/div/div/shift-details/form/div[4]/input[1]");
        
    public SettingsPage typeserviceName(String sName) {
        driver.findElement(serviceName).sendKeys(sName);
        return this;	
    }

    public SettingsPage selectStartTimeHrs(String sTimeHrs) {
    	startTimeHrs = driver.findElement(By.id("startTimeHours"));
    	Select dropdownHrs = new Select(startTimeHrs);
    	dropdownHrs.selectByValue(sTimeHrs);
        return this;	
    }

    public SettingsPage selectStartTimeMins(String sTimeMns) {
    	startTimeMins = this.driver.findElement(By.id("startTimeMins"));
        Select dropdownMins = new Select(startTimeMins);    
    	dropdownMins.selectByValue(sTimeMns);
        return this;	
    }
    
    public SettingsPage selectEndTimeHrs(String eTimeHrs) {
    	endTimeHrs = this.driver.findElement(By.id("endTimeHours"));
        Select dropdownEHrs = new Select(endTimeHrs);
    	dropdownEHrs.selectByValue(eTimeHrs);
        return this;	
    }

    public SettingsPage selectEndTimeMins(String eTimeMns) {
    	endTimeMins = this.driver.findElement(By.id("endTimeMins"));
        Select dropdownEMins = new Select(endTimeMins); 
    	dropdownEMins.selectByValue(eTimeMns);
        return this;	
    }
    
    public SettingsPage selectBookingFreq(String Bfreq) {  	
    	bookFreq = this.driver.findElement(By.id("timeslotInterval"));
        Select dropdownBkFreq = new Select(bookFreq);dropdownBkFreq.selectByValue(Bfreq);
        return this;	
    }
    
    public SettingsPage selectAll() {
        driver.findElement(repeatAll).click();
        return this;	
    }
    
    public SettingsPage addServicebtn() {
        driver.findElement(submit).click();
        return new SettingsPage(driver);	
    }
    
    public SettingsPage addService(String sName, String sTimeHrs,String sTimeMns,String eTimeHrs,String eTimeMns,String Bfreq) {
    	typeserviceName(sName);
    	selectStartTimeHrs(sTimeHrs);
    	selectStartTimeMins(sTimeMns);
    	selectEndTimeHrs(eTimeHrs);
    	selectEndTimeMins(eTimeMns);
    	selectBookingFreq(Bfreq);
    	selectAll();
        return addServicebtn();
    }
}
