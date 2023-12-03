package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{

	/* similar to loginpage class*/
	public WelcomePage(RemoteWebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	/*============================================================*/
	public MyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	
		return new MyHomePage();
	}
	
	public LoginPage clickLogoutButton() {
		
		System.out.println("LogOut Successfull");
		//return new LoginPage();//use this for sequential exec in x,ml
		return new LoginPage(driver);//use this for parallel exec in x,ml
	}
	
	
	public WelcomePage verifyLoginPage() {
		System.out.println("Login Successfull");
	return this;
	}
	
}
