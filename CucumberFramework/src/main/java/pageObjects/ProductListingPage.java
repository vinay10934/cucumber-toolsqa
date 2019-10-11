package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductListingPage 
{
	final int i = 0;
	
	public ProductListingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindAll(@FindBy(how = How.CSS,using = ".noo-product-inner"))
	List<WebElement> prd_List ;
	
	@FindBy(how=How.XPATH,using = "//select[@id='pa_color']")
	private WebElement colour;
	
	@FindBy(how=How.XPATH,using ="//select[@id='pa_size']")
	private WebElement size;
	
	@FindBy(how=How.CSS,using = "button.single_add_to_cart_button")
	private WebElement addtocart;
	
	public void product_List() throws InterruptedException
	{
		System.out.println("value is" + i);
		prd_List.get(i).click();
	}
	
	public void Select_colour(String CLR )
	{
		colour.click();
		Select s = new Select(colour);
		s.selectByValue(CLR);
	}
	public void Select_size(String Size)
	{
		size.click();
		Select s1 = new Select(size);
		s1.selectByValue(Size);

	}
	public void ADD_Cart()
	{
		addtocart.click();
	}
}
