package Cucumberoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "F:\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
//		System.setProperty("webdriver.ie.driver", "‪F:\\IEDriverServer.exe");
//		WebDriver driver= new InternetExplorerDriver();
		driver.get("https://accounts.google.com/signin");
		Thread.sleep(5000);
	}
}
