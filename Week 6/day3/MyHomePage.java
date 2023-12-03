package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class MyHomePage  extends ProjectSpecificMethod   {
	
	public MyLeadPage clickLeadsTab() {
	driver.findElement(By.linkText("Leads")).click();
	return new MyLeadPage(driver);
	
	}

}
