package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	
public WebDriver driver;
	
	By login=By.cssSelector("a[href*='sign_in']");
	By valtext=By.xpath("//*[@id=\"content\"]/div/div");
	By valdisplay=By.cssSelector("#homepage > header > div.navbar.navbar-default.navbar-static-top > div > nav");
	By cook=By.cssSelector("#homepage > div.sumo-form-wrapper.listbuilder-popup > div.listbuilder-popup-content > div > div > div > span > div > div.sumome-react-wysiwyg-component.sumome-react-wysiwyg-outside-horizontal-resize-handles.sumome-react-wysiwyg-outside-vertical-resize-handles.sumome-react-wysiwyg-close-button.sumome-react-wysiwyg-popup-image.sumome-react-wysiwyg-image > div > div > div:nth-child(2)");
	
	
	public HomePageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		
		this.driver=driver;
	}

	public LoginPageObjects LoginId()
	{
		 driver.findElement(login).click();
		 LoginPageObjects l=new LoginPageObjects(driver);
		 return l;
	}
	public List<WebElement> cookiesize()
	{
		return driver.findElements(cook);
	}
	
	public WebElement cookies()
	{
		return driver.findElement(cook);
	}
	public WebElement Display()
	{
		return driver.findElement(valdisplay);
	}
	
	public WebElement Validate()
	{
		return driver.findElement(valtext);
	}
	
}
