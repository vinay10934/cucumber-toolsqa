package Facebook.Facebook;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Facebook.Facebook.Resources.base;

public class FB_Login_page extends base {
	
	
	/*@Test(dataProvider = "data")*/
	@Test
	public void log_in() throws IOException, InterruptedException
	{
		datafile();
		Initiate_Browser();
		try
		{
		Launch_Url();
		}
		catch(Exception e)
		{
			System.out.println("browser launch error");
		}
	Login_Page_FB lp = new Login_Page_FB(driver);
	
	/*lp.username().sendKeys(user);
	lp.password().sendKeys(pass);*/
	
	lp.username().sendKeys(prop.getProperty("username"));
	lp.password().sendKeys(prop.getProperty("password"));
	lp.Login_button().submit();
	
	
	
	
	}
	/*@DataProvider
	public Object[][]  data()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "2nd username";
		data[0][1] = "2nd password";
		data[1][0] = "3rd username";
		data[1][1] = "3rd password";
		data[2][0] = "4th username";
		data[2][1] = "4th password";
		return data;
	}*/
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver = null;
	}
	

}
