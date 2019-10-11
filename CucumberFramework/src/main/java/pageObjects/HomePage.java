package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import dataProvider.ConfigFileReader;
import managers.FileReaderManager;

public class HomePage {
	ConfigFileReader configFileReader;
	WebDriver driver;

	public HomePage(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();
	}

	public void navigateTo_HomePage() throws IOException {
		//driver.get(configFileReader.geturl());
		driver.get(FileReaderManager.getInstance().getConfigReader().geturl());
	}

	public void perform_Search(String search) {
		driver.navigate().to("http://shop.demoqa.com/?s=" + search + "&post_type=product");
	}

}
