package FunctionalTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

public class Firstjunittest {

	// Pre conditions
	
	@Before
	public void SetUp()
	{
		System.out.println("Precondition is good");
	}
	
	//test cases with methods
	
	@Test
	public void openbrowser()
	{
		System.out.println("method for open browser");
		
		Assert.assertEquals(10, 20);
	}
	
	@Test
	public void writingsometext()
	{
		System.out.println("method for writing some text");		
	}
	
	@Test
	public void clickingonalink()
	{
		System.out.println("method for clicking on a link");
	}
	
	// Post conditions
	
		@After
		public void Teardown()
		{
			System.out.println("Post condition is good");
		}
}
