package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	
public WebDriver driver;
	
	By login=By.cssSelector("#user_email");
	
	By button=By.cssSelector("#hero > div > form > div.form-group.text-center > input");
	
	
	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		
		this.driver=driver;
	}

	
	public WebElement getEmail()
	{
		return driver.findElement(login);
	}
	
	public WebElement sendInstr()
	{
		return driver.findElement(button);
	}
	
}
