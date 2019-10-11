package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

public CartPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

@FindBy(how=How.CSS,using = "a.cart-button")
private WebElement Cart_Button;
	
@FindBy(how=How.CSS,using = ".checkout-button.alt")
private WebElement Checkout_Button;

public void ClickOn_Cart()
{
	Cart_Button.click();
}

public void Clickon_checkout()
{
	Checkout_Button.click();
}

}
