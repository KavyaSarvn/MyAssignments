package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginHATC_001 extends ProjectSpecificMethod{
	
@Test	
	public void runLogin()
	{
		 new LoginPage(driver);
	}
}
