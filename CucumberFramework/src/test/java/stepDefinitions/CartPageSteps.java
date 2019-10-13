package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import pageObjects.CartPage;

public class CartPageSteps {

	TestContext testContext;
	CartPage cartPage;
		
	public CartPageSteps(TestContext context)
	{
	testContext = context;
	cartPage = testContext.getPageObjectManager().getCartPage();
	}
	
	@When("^moves to checkout from mini cart$")
	public void moves_to_checkout_from_mini_cart() throws Throwable 
	{
		Thread.sleep(3000);
		cartPage.ClickOn_Cart();
		cartPage.Clickon_checkout();
		System.out.println("GITHUBCART");
}
}
