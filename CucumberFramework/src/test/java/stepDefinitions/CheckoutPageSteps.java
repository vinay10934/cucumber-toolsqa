package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import pageObjects.CheckoutPage;

public class CheckoutPageSteps {
	TestContext testContext;
	CheckoutPage checkoutPage;
	
	public CheckoutPageSteps(TestContext context)
	{
		testContext = context;
		checkoutPage =testContext.getPageObjectManager().getCheckoutPage();
	}
	@When("^enter personal details on checkout page$")
	public void enter_personal_details_on_checkout_page() throws Throwable {
		Thread.sleep(3000);
		
		checkoutPage.fill_PersonalDetails();
		Thread.sleep(2000);
		System.out.println("vinay kumar Barnwal");
	}

	@When("^place the order$")
	public void place_the_order() throws Throwable {
		Thread.sleep(2000);
		checkoutPage.clickOn_PlaceOrder();
		Thread.sleep(7000);
		System.out.println("GITHUB");
	
	}

}
