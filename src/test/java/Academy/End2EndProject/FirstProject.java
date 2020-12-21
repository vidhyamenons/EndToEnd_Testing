package Academy.End2EndProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.HomePageObjects;
import PageObject.LoginPageObjects;
import Resources.Base;

public class FirstProject extends Base {
	private static Logger Log = LogManager.getLogger(Base.class.getName());
public WebDriver driver;
	@BeforeTest
	public void before() throws IOException
	{
		driver=initialiseDriver();
		driver.get(prop.getProperty("url"));
		Log.info("Succesfully navigated");
	}
	
	@Test
	public void basePageNavigation () throws IOException
	{
		
		HomePageObjects h=new HomePageObjects(driver);
		
		h.cookies().click();
		LoginPageObjects l=h.LoginId();
		
		l.emailId().sendKeys("email");
		l.password().sendKeys("123");
		l.signin().click();
		Log.info("Succesfully CLICKED");
	l.forgotpassword().getEmail().sendKeys("jjj");
	l.forgotpassword().sendInstr().click();
	Assert.assertTrue(true);
	Log.info("Succesfully CLICKED SEND INSTRUCTIONS");
	}
	@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	
	
}
