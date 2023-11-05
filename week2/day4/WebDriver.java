package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); // initialising webdriver ChromeDriver
		driver.get("http://leaftaps.com/opentaps/"); // to launch the url
		driver.manage().window().maximize(); // maximize
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click(); //login button
		driver.findElement(By.linkText("CRM/SFA")).click();
		WebElement createAcc = driver.findElement(By.linkText("Create Account"));
		createAcc.click();
		driver.findElement(By.id("accountName")).sendKeys("Kavya R");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industryLL = driver.findElement(By.name("industryEnumId")); 
		Select industry = new Select(industryLL); 
		industry.selectByVisibleText("Computer Software"); 
		
		
	    WebElement ownership = driver.findElement(By.name("ownershipEnumId")); 
		Select ownerShip = new Select(ownership); 
		ownerShip.selectByVisibleText("S-Corporation"); 
		
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(sourceDD); 
		source.selectByValue("LEAD_EMPLOYEE");
		
		
		WebElement marketingCamp = driver.findElement(By.id("marketingCampaignId"));
		Select marketing = new Select(marketingCamp); // Select is a class from Selenium
		marketing.selectByIndex(6);
		
		WebElement createAccount = driver.findElement(By.className("smallSubmit"));
		createAccount.click();
		
	}

}
