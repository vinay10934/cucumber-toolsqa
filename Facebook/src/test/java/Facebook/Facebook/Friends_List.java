package Facebook.Facebook;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Facebook.Facebook.Resources.base;

public class Friends_List extends base {
	
	
	@Test
	public void Friends_list() throws IOException, AWTException, InterruptedException
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
	
	Thread.sleep(2000);
	Robot();
	Home_Page hp = new Home_Page(driver);
	Thread.sleep(4000);
	hp.Friends_link().click();
	Keys.chord(Keys.ESCAPE);
	Robot1();
	Thread.sleep(3000);
	int size = hp.Friends_name().size();
	System.out.println(size);
	//hp.Friends_name1(size);
	for (int i =1;i<=size;i++)
	{
		String name =hp.Friends_name1(i).getText();
		System.out.println(name);
		Assert.assertTrue(false);
	}
	
	}
	@Test
	public void test()
	{
		System.out.println("testing");
		
	}
	
	/*@AfterTest
	public void tear()
	{
		teardown();
	}
*/	

}
