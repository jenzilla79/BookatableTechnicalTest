package FunctionalTests;

import java.io.File;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.robot.desktop.DesktopMouse;

public class sikulitestBis {
	
	@Test
	public void sikulitest() throws InterruptedException
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.uk/maps");
		
		driver.findElement(By.id("ml-searchboxinput")).sendKeys("London");
		driver.findElement(By.id("ml-searchboxinput")).sendKeys(Keys.ENTER);
				
		ScreenRegion s = new DesktopScreenRegion();
		Target target = new ImageTarget(new File("C:\\Users\\Jenella\\earth.png"));
		ScreenRegion r = s.wait(target,80000);
		r=s.find(target);
		org.sikuli.api.robot.Mouse mouse =  new DesktopMouse();
		mouse.click(r.getCenter());
		
		
	}
	

}