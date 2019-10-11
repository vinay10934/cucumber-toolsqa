package stepDefinitions;

import java.io.IOException;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {

	HomePage homePage;

	TestContext testContext;

	public HomePageSteps(TestContext context) throws IOException {
		testContext = context;
		homePage = testContext.getPageObjectManager().gethomepage();
	}

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		Thread.sleep(2000);
		homePage.navigateTo_HomePage();

	}

	@When("^he search for \\\"([^\\\"]*)\\\"$")
	public void he_search_for(String product) throws Throwable {
		homePage.perform_Search(product);
		Thread.sleep(3000);
	}

}
