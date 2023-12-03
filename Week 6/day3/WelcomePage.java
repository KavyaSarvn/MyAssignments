package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{

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
