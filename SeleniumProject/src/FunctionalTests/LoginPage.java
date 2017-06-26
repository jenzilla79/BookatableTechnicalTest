package FunctionalTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	    private final WebDriver driver;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;

	        // Check that we're on the right page.
	        if (!"Log in - Neptune Identity".equals(driver.getTitle())) {
	            throw new IllegalStateException("This is not the login page");
	        }
	    }

	    // The login page contains several HTML elements that will be represented as WebElements.
	    // The locators for these elements should only be defined once.
	        By emailLocator = By.id("Email");
	        By passwordLocator = By.id("Password");
	        By loginButtonLocator = By.className("nwt-button-primary");

	    // The login page allows the user to type their email into the email field
	    public LoginPage typeUsername(String email) {
	        driver.findElement(emailLocator).sendKeys(email);

	        // Return the current page object as this action doesn't navigate to a page represented by another PageObject
	        return this;	
	    }

	    // The login page allows the user to type their password into the password field
	    public LoginPage typePassword(String password) {
	        // This is the only place that "knows" how to enter a password
	        driver.findElement(passwordLocator).sendKeys(password);

	        // Return the current page object as this action doesn't navigate to a page represented by another PageObject
	        return this;	
	    }

	    // The login page allows the user to submit the login form
	    public HomePage submitLogin() {
	        // This is the only place that submits the login form and expects the destination to be the home page.
	        driver.findElement(loginButtonLocator).submit();

	        return new HomePage(driver);	
	    }

	    // The login page allows the user to submit the login form knowing that an invalid email and / or password were entered
	    public LoginPage submitLoginExpectingFailure() {
	        // This is the only place that submits the login form and expects the destination to be the login page due to login failure.
	        driver.findElement(loginButtonLocator).submit();

	        // Return a new page object representing the destination. Should the user ever be navigated to the home page after submiting a login with credentials 
	        // expected to fail login, the script will fail when it attempts to instantiate the LoginPage PageObject.
	        return new LoginPage(driver);	
	    }

	    public HomePage loginAs(String email, String password) {
	        // The PageObject methods that enter email, password & submit login have already defined and should not be repeated here.
	        typeUsername(email);
	        typePassword(password);
	        return submitLogin();
	    }
}
