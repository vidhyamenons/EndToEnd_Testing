package Stepdefinitionpack;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import PageObject.HomePageObjects;
import PageObject.LoginPageObjects;
import Resources.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition extends Base {

    @Given("^Initialise browser with chrome$")
    public void initialise_browser_with_chrome() throws Throwable {
    	driver=initialiseDriver();
       
    }
    @And("^Navigte to \"([^\"]*)\"$")
    public void navigte_to_something(String strArg1) throws Throwable {
    	driver.get(strArg1);
    }

    @And("^Click on login button to navigate to sign in page$")
    public void click_on_login_button_to_navigate_to_sign_in_page() throws Throwable {
    	HomePageObjects h=new HomePageObjects(driver);
    	if(h.cookiesize().size()>0)
    	{
			h.cookies().click();
    	}
		LoginPageObjects l=h.LoginId();
    }
    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
    	HomePageObjects h=new HomePageObjects(driver);
    	LoginPageObjects l=h.LoginId();
    	l.emailId().sendKeys(username);
		l.password().sendKeys(password);
	//	l.signin().click();
    }


   /* @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
    	
    	HomePageObjects h=new HomePageObjects(driver);
    	LoginPageObjects l=h.LoginId();
    	l.emailId().sendKeys(strArg1);
		l.password().sendKeys(strArg2);
		l.signin().click();
		  }*/

    @Then("^Verify user is succesfully logged in$")
    public void verify_user_is_succesfully_logged_in() throws Throwable {
       System.out.println("Successfull"); 
    }
    @And("^Close browser$")
    public void close_browser() throws Throwable {
       driver.close();
    }

    

}