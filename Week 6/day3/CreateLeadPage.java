package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{

	public CreateLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage enterCompanyName(String compName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}
	
	public CreateLeadPage enterPhno(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		return this;
	}
	
	public ViewLeadPage clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}