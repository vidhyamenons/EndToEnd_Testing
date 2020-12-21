package Academy.End2EndProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.HomePageObjects;
import Resources.Base;

public class Validatedisplay extends Base {
	private static Logger Log = LogManager.getLogger(Base.class.getName());
	public WebDriver driver;

	@BeforeTest
	public void before() throws IOException
	{
		driver=initialiseDriver();
		driver.get(prop.getProperty("url"));	
	}
	
	@Test
	public void display()
	{
		HomePageObjects h=new HomePageObjects(driver);
		
		Assert.assertTrue(h.Display().isDisplayed());
		Log.info("Is displayed");
	}
@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	
}
