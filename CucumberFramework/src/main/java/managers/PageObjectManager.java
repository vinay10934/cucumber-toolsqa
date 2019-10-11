package managers;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;

public class PageObjectManager {

	private HomePage homePage;
	private ProductListingPage productlistingpage;
	private CheckoutPage checkoutPage;
	private CartPage cartPage;
	WebDriver driver;
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public HomePage gethomepage() throws IOException
	{
		return(homePage == null)?homePage = new HomePage(driver): homePage;
	}
	
	public ProductListingPage getproductlistingpage()
	{
		return(productlistingpage ==null)?productlistingpage = new ProductListingPage(driver):productlistingpage;
		
	}
	
	public CheckoutPage getCheckoutPage()
	{
		return(checkoutPage ==null)?checkoutPage = new CheckoutPage(driver):checkoutPage;
		
	}
	
	public CartPage getCartPage()
	{
		return(cartPage ==null)?cartPage = new CartPage(driver):cartPage;
		
	}
}
