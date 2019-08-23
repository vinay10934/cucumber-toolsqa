package stepDefinition;

import org.junit.runner.RunWith;

import Facebook.Facebook.Login_Page_FB;
import Facebook.Facebook.Resources.base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class StepDefinition extends base {
	//public Login_Page_FB lp = new Login_Page_FB(driver);

	@Given("^User is on Login page$")
	public void user_is_on_login_page() throws Throwable {
		System.out.println("user is on login page");
		datafile();
		Initiate_Browser();
		try {
			Launch_Url();
		} catch (Exception e) {
			System.out.println("browser launch error");
		}
	}

	@When("^user enters username$")
	public void user_enters_username() throws Throwable {
		Login_Page_FB lp = new Login_Page_FB(driver);
		System.out.println("user eneters usename as ");

		lp.username().sendKeys(prop.getProperty("username"));
	}

	@When("^password$")
	public void password() throws Throwable {
		Login_Page_FB lp = new Login_Page_FB(driver);
		System.out.println("user enters pass as ");
		lp.password().sendKeys(prop.getProperty("password"));
		lp.Login_button().submit();
	}

	@Then("^page is populated$")
	public void page_is_populated() throws Throwable {
		System.out.println("Page is populated");

	}

}
