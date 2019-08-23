package Facebook.Facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	public WebDriver driver;
	//By frindslink = By.xpath("//span[@class='_50f8 _2iem']/a");
	
	
	By total = By.xpath("//ul[@class='uiList _262m _4kg']/child::li/div/div/div[2]/div/div[2]/div/a");
	//By total = By.xpath("//u1[@class='uiList _262m _4kg']/child::li/div/div/div[2]/div/div[2]/div/a");
	By get_name = By.xpath("//ul[@class='uiList _262m _4kg']/li[i]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a");
	By frindslink = By.linkText("Friends");
	
	public Home_Page(WebDriver driver)
	{
		this.driver =driver;
	}

	public List<WebElement> Friends_name()
	{
		return driver.findElements(total);
	}
	
	public WebElement Friends_name1(int j)
	
	{
		return driver.findElement(By.xpath("//ul[@class='uiList _262m _4kg']/child::li[" +j+"]/div/div/div[2]/div/div[2]/div/a"));
	}
	
	public WebElement Friends_link()
	{
		return driver.findElement(frindslink);
	}
}
