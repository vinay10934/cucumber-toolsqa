package dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	private Properties properties;
	private String propertyfilepath = "configs//Configuation.properties";
	
	public ConfigFileReader() throws IOException
	{
		FileInputStream File;
		properties = new Properties();
		File = new FileInputStream(propertyfilepath);
		
		properties.load(File);
		
			
	}
	
	public String getdriverpath()
	{
		String driverpath = properties.getProperty("DriverPath");
		System.out.println(driverpath);
		if(driverpath!=null) return driverpath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file."); 
	}
	
	public String geturl()
	{
		String URL = properties.getProperty("URL");
		if(URL!=null)
		{
			return URL;
		}
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	public DriverType getBrowser() {
		 String browserName = properties.getProperty("browser");
		 if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
		 else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		 else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
		 else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
		 }
		 
		 public EnvironmentType getEnvironment() {
		 String environmentName = properties.getProperty("environment");
		 if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
		 else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
		 else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
		 }
		 
		 public Boolean getBrowserWindowSize() {
		 String windowSize = properties.getProperty("windowMaximize");
		 if(windowSize != null) return Boolean.valueOf(windowSize);
		 return true;
		 }
	
		}
