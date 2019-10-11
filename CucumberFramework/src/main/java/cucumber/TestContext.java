package cucumber;

import java.io.IOException;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {

	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	
	public TestContext() throws IOException
	{
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
		
	}
	
	public WebDriverManager getWebDriverManager()
	{
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager()
	{
		return pageObjectManager;
	}
}
