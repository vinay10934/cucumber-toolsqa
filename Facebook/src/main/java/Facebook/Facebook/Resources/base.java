package Facebook.Facebook.Resources;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.aventstack.extentreports.utils.FileUtil;

public class base {

	public static  WebDriver driver;
	public Properties prop;
	public void datafile() throws IOException
	{
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\vinay\\eclipse-workspace\\Facebook\\src\\main\\java\\Facebook\\Facebook\\Resources\\data.properties");
		prop.load(file);
	}
	
	public WebDriver Initiate_Browser()
	{
		String brow = prop.getProperty("browser");
		if (brow.equalsIgnoreCase("chrome"))
		{ 
			System.setProperty("webdriver.chrome.driver", "E://JARS//chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebDriver Launch_Url()
	{
		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		return driver;
			
	}
	
	public void action()
	{
		Actions builder = new Actions(driver);
		builder.sendKeys(Keys.ESCAPE);
		builder.build().perform();
		
	}
	
	public void Robot() throws AWTException, InterruptedException
	{
		java.awt.Robot builder = new java.awt.Robot();
		builder.mouseWheel(5);
	
		
	}
	public void Robot1() throws AWTException, InterruptedException
	{
		Keys.chord(Keys.ARROW_DOWN);
	}
	
	public void Screenshots() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:/Users/vinay/eclipse-workspace/Facebook/Screenshot/failed.png"));
	}
	
	public void teardown()
	{
		driver.close();
		driver = null;
	}
	
	
	
	
	
}
