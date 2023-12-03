package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class MyLeadPage  extends ProjectSpecificMethod {

	public MyLeadPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	

	public CreateLeadPage clickLeadsTab()
	{
		
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
}
