package Facebook.Facebook;

import java.io.IOException;

import org.testng.annotations.Test;

import Facebook.Facebook.Resources.base;

public class Home_Page_Navigation extends base {
	
	@Test
	public void Home() throws IOException
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
	lp.username().sendKeys(prop.getProperty("username"));
	lp.password().sendKeys(prop.getProperty("password"));
	lp.Login_button().submit();
	action();
	lp.Home_Page().click();
		
	}

}
