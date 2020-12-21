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
import jdk.internal.org.jline.utils.Log;


public class Validatetext extends Base {
	private static Logger Log = LogManager.getLogger(Base.class.getName());
	public WebDriver driver;
	@BeforeTest
	public void before() throws IOException
	{
		driver=initialiseDriver();
		Log.info("Driver is initialised");
		driver.get(prop.getProperty("url"));	
		Log.info("Navigated to url");
	}
	
	@Test
	public void textvalidation()
	{
		HomePageObjects h=new HomePageObjects(driver);
		String t=h.Validate().getText();
		Assert.assertEquals(t, "FEATURED COURSES123");
		Log.info("Succesfully validated text");
	}
	
@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	
}
