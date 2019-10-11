package seleniumTests;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Iterators;

public class E2E_Test {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://JARS//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.shop.demoqa.com");
		driver.navigate().to("http://shop.demoqa.com/?s=" + "dress" + "&post_type=product");
		List<WebElement> product = driver.findElements(By.xpath("//div[@class='noo-product-inner']"));
		product.get(0).click();
		WebElement selectcolour = driver.findElement(By.xpath("//select[@id='pa_color']"));
		selectcolour.click();
		Select s = new Select(selectcolour);
		s.selectByValue("white");
		WebElement selectsize = driver.findElement(By.xpath("//select[@id='pa_size']"));
		selectsize.click();
		Select s1 = new Select(selectsize);
		s1.selectByValue("medium");

		WebElement addToCart = driver.findElement(By.cssSelector("button.single_add_to_cart_button"));
		addToCart.click();

		WebElement cart = driver.findElement(By.cssSelector("a.cart-button"));
		cart.click();

		WebElement continueToCheckout = driver.findElement(By.cssSelector(".checkout-button.alt"));
		continueToCheckout.click();

		WebElement firstName = driver.findElement(By.cssSelector("#billing_first_name"));
		firstName.sendKeys("Lakshay");

		WebElement lastName = driver.findElement(By.cssSelector("#billing_last_name"));
		lastName.sendKeys("Sharma");
		Thread.sleep(5000);

		WebElement countryDropDown = driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));
		countryDropDown.click();

		List<WebElement> countrylist = driver.findElements(By.xpath("//span[@class='select2-results']/ul/li"));
		int i = countrylist.size();
		System.out.println(i);
		for (WebElement country : countrylist) {
			if (country.getText().equals("India")) {
				country.click();
				Thread.sleep(3000);
				break;
			}

		}

		Thread.sleep(2000);
		WebElement address = driver.findElement(By.cssSelector("#billing_address_1"));
		address.sendKeys("Vinay Barnwal");

		WebElement city = driver.findElement(By.cssSelector("#billing_city"));
		city.sendKeys("Pune");

		WebElement terms = driver.findElement(By.xpath("//input[@id='terms']"));
		boolean xyz = terms.isDisplayed();
		System.out.println(xyz);
		terms.click();
		Thread.sleep(2000);

		Thread.sleep(5000);
		WebElement statedropdown = driver
				.findElement(By.xpath("//span[@id='select2-billing_state-container']/following-sibling::span"));
		statedropdown.click();

		List<WebElement> statelist = driver.findElements(By.xpath("//span[@class='select2-results']/ul/li"));
		int j = statelist.size();
		System.out.println(j);
		for (WebElement state : statelist) {
			if (state.getText().equals("Maharashtra")) {
				state.click();
				Thread.sleep(3000);
				break;
			}

		}

		Thread.sleep(2000);

		WebElement postcode = driver.findElement(By.cssSelector("#billing_postcode"));
		postcode.sendKeys("411057");

		WebElement phone = driver.findElement(By.cssSelector("#billing_phone"));
		phone.sendKeys("07438862327");

		WebElement emailAddress = driver.findElement(By.cssSelector("#billing_email"));
		emailAddress.sendKeys("test@gmail.com");

		Thread.sleep(3000);

		WebElement placeorder = driver.findElement(By.id("place_order"));
		placeorder.submit();
		//

		//
		Thread.sleep(2000);

		Thread.sleep(2000);

	}
}
