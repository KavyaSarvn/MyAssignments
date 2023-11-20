package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//base method
public class ProjectSpecificMethod {
	
	public ChromeDriver driver;
	@BeforeMethod
	public void preCondition()
	{
	    driver = new ChromeDriver(); // removed ChromeDriver since we have already declared driver as a public variable.
	    //if this is not done, the after method() will not run and hence it will throw nullpointerexception.
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	@AfterMethod
	public void postCondition() {
		driver.close(); // given driver a data type "public ChromeDriver driver;" so that it doesn't throw error
	}
}
