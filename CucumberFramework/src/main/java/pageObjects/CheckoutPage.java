package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = "#billing_first_name")
	private WebElement txtbx_FirstName;

	@FindBy(how = How.CSS, using = "#billing_last_name")
	private WebElement txtbx_LastName;

	@FindBy(how = How.XPATH, using = "//span[@class='select2-selection__arrow']")
	private WebElement drpdwn_CountryDropDownArrow;

	@FindBy(how = How.XPATH, using = "//span[@class='select2-results']/ul/li")
	private List<WebElement> country_List;

	@FindBy(how = How.CSS, using = "#billing_address_1")
	private WebElement txtbx_Address;

	@FindBy(how = How.CSS, using = "#billing_city")
	private WebElement txtbx_City;

	@FindBy(how = How.XPATH, using = "//input[@id='terms']")
	private WebElement chkbx_AcceptTermsAndCondition;

	@FindBy(how = How.XPATH, using = "//span[@id='select2-billing_state-container']/following-sibling::span")
	private WebElement drpdwn_StateDropDownArrow;

	@FindBy(how = How.XPATH, using = "//span[@class='select2-results']/ul/li")
	private List<WebElement> state_List;

	@FindBy(how = How.CSS, using = "#billing_postcode")
	private WebElement txtbx_PostCode;

	@FindBy(how = How.CSS, using = "#billing_phone")
	private WebElement txtbx_Phone;

	@FindBy(how = How.CSS, using = "#billing_email")
	private WebElement txtbx_Email;

	@FindBy(how = How.ID, using = "place_order")
	private WebElement btn_PlaceOrder;

	public void enter_Name(String name) {
		txtbx_FirstName.sendKeys(name);
	}

	public void enter_LastName(String lastName) {
		txtbx_LastName.sendKeys(lastName);
	}

	public void enter_Email(String email) {
		txtbx_Email.sendKeys(email);
	}

	public void enter_Phone(String phone) {
		txtbx_Phone.sendKeys(phone);
	}

	public void enter_City(String city) {
		txtbx_City.sendKeys(city);
	}

	public void enter_Address(String address) {
		txtbx_Address.sendKeys(address);
	}

	public void enter_PostCode(String postCode) {
		txtbx_PostCode.sendKeys(postCode);
	}

	public void select_Country(String countryName) throws InterruptedException {
		drpdwn_CountryDropDownArrow.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		for (WebElement country : country_List) {
			if (country.getText().equals(countryName)) {
				country.click();
				Thread.sleep(3000);
				break;
			}

		}

	}

	public void select_State(String stateName) throws InterruptedException {
		drpdwn_StateDropDownArrow.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		for (WebElement country : country_List) {
			if (country.getText().equals(stateName)) {
				country.click();
				Thread.sleep(3000);
				break;
			}

		}

	}
	
	public void check_TermsAndCondition(boolean value) {
		if (value)
			chkbx_AcceptTermsAndCondition.click();
	}

	public void clickOn_PlaceOrder() {
		btn_PlaceOrder.submit();
	}

	public void fill_PersonalDetails() throws InterruptedException {
		enter_Name("Vinay");
		enter_LastName("Barnwal");
		Thread.sleep(2000);
		select_Country("India");
		Thread.sleep(2000);
		enter_Address("Shalimar Bagh");
		enter_City("Delhi");
		Thread.sleep(2000);
		select_State("Delhi");
		check_TermsAndCondition(true);
		enter_PostCode("110088");
		enter_Phone("0000000000");
		enter_Email("Automation@gmail.com");
		
		
		

	}

}
