package Facebook.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Login_Page_FB  {
	public WebDriver driver;
	By username = By.xpath("//input[@name='email']");
	By password = By.xpath("//input[@id='pass']");
	By login_button = By.xpath("//input[@data-testid='royal_login_button']");
	//By Homepage= By.xpath("//div[@class='_1k67 _cy7']");
	By Homepage= By.xpath("//div[@class='_1k67 _cy7']");
	
	public  Login_Page_FB(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public WebElement username()
	{
		return driver.findElement(username);
	
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Login_button()
	{
		return driver.findElement(login_button);
	}
	
	public WebElement Home_Page()
	{
		return driver.findElement(Homepage);
	}

}
