package FunctionalTests;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class bookatable {
	
	WebDriver driver ;
		
	@BeforeTest
	public void setup() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(("https://erb.bookatable.com"));
	}
	
	@AfterTest
	public void teardown()
	{
		//System.out.println("tear down");
		//driver.quit();
	}
	
	@Test(priority = 0)
	public void verifyLogin() {

		System.out.println("First Test");
	    //Creating instance of loginPage
	    LoginPage loginPage = new LoginPage(driver);
		
	    //Login to application
	    loginPage.loginAs("omnia.erb+jenella.marriott@gmail.com","T3ster");   
			
		String title = driver.getTitle();
        // Check that we're on the right page.
        if (!"Omnia Web - Booking Manager".equals(title)) {
            throw new IllegalStateException(title +" This is not the bookings manager page");
        }
	}
	
	@Test(priority = 1)
	public void selectMenu() throws InterruptedException
	{
	   System.out.println("Second Test");
	   
		//Select Menu and Item
	   HomePage homePage = new HomePage(driver);
	   
	   homePage.clickMenu();
	   TimeUnit.SECONDS.sleep(2);
		String title = driver.getTitle();
        // Check that we're on the right page.
        if (!"Settings".equals(title)) {
            throw new IllegalStateException(title +" This is not the Settings page");
        }
	}
	
	@Test(priority = 2)
	public void addService() throws InterruptedException
	{
	   System.out.println("Third Test");
	   
		//Select Menu and Item
	   HomePage homePage = new HomePage(driver);
	   
	   homePage.clickAddService();

	   boolean result = homePage.isAddServiceVisible();
	   Assert.assertTrue(result);
	}
	
	@Test(priority = 3)
	public void createService() throws InterruptedException {

		System.out.println("Fourth Test");
	    //Creating instance of settingsPage
	    SettingsPage settingsPage = new SettingsPage(driver);
		
	    //add service
	    settingsPage.addService("Dinner", "17","30","22","30","30");   
		
	    TimeUnit.SECONDS.sleep(2);
		//String title = driver.getTitle();
	    WebElement confirmMessage = driver.findElement(By.xpath("/html/body/div[2]/div[2]/ui-view/ui-view/div/div[2]/div/div/h2"));
	    String msg = confirmMessage.getText();
	    Assert.assertEquals(msg, "Service added");
	}
}
