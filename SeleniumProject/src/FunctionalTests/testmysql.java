package FunctionalTests;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mysql.jdbc.Connection;

public class testmysql {

	String destinationvalue;
	
	@Test
	public void readvaluefromdb() throws SQLException
	{
		String dbURL = "jdbc:mysql://localhost:3306/training";
		Connection conn = (Connection) DriverManager.getConnection(dbURL,"root","root");
		
				
		Statement s = (Statement)conn.createStatement();
		ResultSet rs = s.executeQuery("select * from destination");
		
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			destinationvalue = rs.getString(1);
			
			FirefoxDriver driver = new FirefoxDriver();
			
			driver.get("http://easyjet.com");
			
			List<WebElement> list = driver.findElementsByTagName("iframe");
			
			driver.switchTo().frame("tabco-iframe-1");
			driver.findElement(By.id("acDestinationAirport")).sendKeys(destinationvalue);
			
		}
		
		//using the value in frames
		
		/*FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://easyjet.com");
		
		List<WebElement> list = driver.findElementsByTagName("iframe");
		
		driver.switchTo().frame("tabco-iframe-1");
		driver.findElement(By.id("acDestinationAirport")).sendKeys(destinationvalue);
		*/
				
		
	}
}
