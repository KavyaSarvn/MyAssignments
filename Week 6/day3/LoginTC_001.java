package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;

//import pages.WelcomePage;
import pages.LoginPage;

public class LoginTC_001  extends ProjectSpecificMethod

{
@Test
public void runLogin()
{
	
	// the below process is big and since we cannot extend two classes
	// hence we will use the return statement in their respective methods
	
	/*
	 * LoginPage lp=new LoginPage(); lp.enterUsername() .enterPassword()
	 * .clickLoginButton();
	 * 
	 * WelcomePage wp=new WelcomePage(); wp.clickCrmsfaLink();
	 */

/*After returning in the respective methods*/
	
	//LoginPage lp=new LoginPage(); // use this for sequential ececution in xml
	LoginPage lp=new LoginPage(driver);//use loginPge(driver) for parallel execution
   lp.enterUsername() 
	.enterPassword()
   .clickLoginButton()
   .clickCrmsfaLink();

}


}
