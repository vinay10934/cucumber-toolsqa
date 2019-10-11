/*package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;

public class Steps {

	static WebDriver driver;
	HomePage home;
	CheckoutPage Chkoutpg;
	ProductListingPage prolist;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	   Thread.sleep(2000);
		//System.setProperty("webdriver.chrome.driver",configfilereader.getdriverpath());
	   webDriverManager = new WebDriverManager();
	   driver = webDriverManager.getDriver();
		driver.manage().window().maximize();
		pageObjectManager = new PageObjectManager(driver);
		home = pageObjectManager.gethomepage();
		home.navigateTo_HomePage();

	    	}

	@When("^he search for \\\"([^\\\"]*)\\\"$")
	public void he_search_for(String product) throws Throwable {
		pageObjectManager = new PageObjectManager(driver);
		home = pageObjectManager.gethomepage();
		home.perform_Search(product);
		Thread.sleep(3000);
	}

	@When("^choose to buy the first item$")
	public void choose_to_buy_the_first_item() throws Throwable {
		pageObjectManager = new PageObjectManager(driver);
		Thread.sleep(3000);
		prolist = pageObjectManager.getproductlistingpage();
		prolist.product_List();
		
		prolist.Select_colour("white");
		prolist.Select_size("medium");
		prolist.ADD_Cart();
			    
	}

	@When("^moves to checkout from mini cart$")
	public void moves_to_checkout_from_mini_cart() throws Throwable {
		Thread.sleep(3000);
		pageObjectManager = new PageObjectManager(driver);
		CartPage Crt = pageObjectManager.getCartPage();
		Crt.ClickOn_Cart();
		Crt.Clickon_checkout();
		    
	}

	@When("^enter personal details on checkout page$")
	public void enter_personal_details_on_checkout_page() throws Throwable {
		Thread.sleep(3000);
		pageObjectManager = new PageObjectManager(driver);
		Chkoutpg = pageObjectManager.getCheckoutPage();
		Chkoutpg.fill_PersonalDetails();
		Thread.sleep(2000);
	}

	@When("^place the order$")
	public void place_the_order() throws Throwable {
		Thread.sleep(2000);
		pageObjectManager = new PageObjectManager(driver);
		Chkoutpg = pageObjectManager.getCheckoutPage();
		Chkoutpg.clickOn_PlaceOrder();
		Thread.sleep(7000);
		driver.quit();
	}
	
	
	
}
*/