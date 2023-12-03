package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
@Test
public class ProjectSpecificMethod {

	// making it static so that it has single memory address
	//public static RemoteWebDriver driver; // use this for sequential execution in xml
	public RemoteWebDriver driver;// use this for  parallel execution in xml-remove static


@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/");
		
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
}
