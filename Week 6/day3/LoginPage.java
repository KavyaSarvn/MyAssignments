package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {

	/* This part was created for parallel execution in xml */
	
	 /*-Created a constructor for  LoginPage and passed driver instance from localVariable to gobalVariable*/	
	
/*=========================================================================================*/	


	public LoginPage(RemoteWebDriver driver) {
		
	this.driver=driver; //localVariable to gobalVariable
	
	}

/*=========================================================================================*/


	
	
	/*For sequential execution in xml the above part is not nececssary*/	
	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	
		/*three different ways to return the elements*/
		
		//1. LoginPage lp=new LoginPage();   return lp; - creating an obj to return

        //2. return new LoginPage();-to return the constructor elemwnts 
        //3. return this-to return the current class elements ,this will also save the memory
           return this;
	
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
		
	}
	
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		/*
		 * WelcomePage wp=new WelcomePage(); return wp;
		 */
		return new WelcomePage();
	}

}