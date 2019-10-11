package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.ProductListingPage;

public class ProductPageSteps {
	
	TestContext testContext;
	ProductListingPage productListingPage;
	public ProductPageSteps(TestContext context)
	{
		testContext = context;
		productListingPage = testContext.getPageObjectManager().getproductlistingpage();
	}


	@When("^choose to buy the first item$")
	public void choose_to_buy_the_first_item() throws Throwable {
		
		Thread.sleep(3000);
		productListingPage.product_List();
		productListingPage.Select_colour("white");
		productListingPage.Select_size("medium");
		productListingPage.ADD_Cart();
					    
	}

}
