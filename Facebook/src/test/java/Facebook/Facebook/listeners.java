package Facebook.Facebook;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Facebook.Facebook.Resources.base;
import utility.Testutility;





public class listeners implements ITestListener{

	public base b = new base();
	
	public void onTestStart(ITestResult result) {
		Testutility test = new Testutility();
		try {
			test.Sendemail();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		Testutility test = new Testutility();
		try {
			test.Sendemail();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void onTestFailure(ITestResult result) {
	
		/*try {
			b.Screenshots();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	// TODO Auto-generated method stub
			Testutility test = new Testutility();
		try {
			test.Sendemail();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
