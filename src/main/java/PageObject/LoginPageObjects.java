package PageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.Base;

public class LoginPageObjects {

	private static Logger Log = LogManager.getLogger(Base.class.getName());
	public WebDriver driver;
	By forgotpswd=By.cssSelector("#hero > div > form > div:nth-child(6) > a");
	By email=By.id("user_email");
	By pswd=By.id("user_password");
	By login=By.cssSelector("[value='Log In']");
	
	public LoginPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	public WebElement emailId()
	{
		return driver.findElement(email);
		
	}
	public ForgotPassword forgotpassword()
	{
		driver.findElement(forgotpswd).click();
		Log.info("Succesfully CLLICKED FRGT PSWD");
		ForgotPassword fp= new ForgotPassword(driver);
		return fp;
	}
	
	public WebElement password()
	{
		return driver.findElement(pswd);
		
	}
	public WebElement signin()
	{
		return driver.findElement(login);
		
	}
	
}
