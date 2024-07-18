package Uibank_LoginPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AppModule.LaunchEnv;
import Reports.Log;
import Reports.Reports;
import Utilities.Utility;

public class LoginActionsPositiveData extends Utility {
  
	@BeforeMethod
	public void pre_conditions() {
		//start Reports
		Log.startTEST("Login Actions for positive Data");
		Reports.startTEST("Login Actions for positive Data","Description");
		//openbrowser
		Assert.assertTrue(LaunchEnv.BrowserInvo(prop_config.getProperty("Browser")));
		//open url
		Assert.assertTrue(LaunchEnv.invokeUrl(prop_config.getProperty("APPUrl")));
	}
	
	
	@Test
  public void LoginActionsWithPositiveData() {
  }
	
	@AfterMethod
	public static void postConditions() {
		LaunchEnv.closeBrowser();
		Log.endTest();
		Reports.endTest();
	}
}
