package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAcc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); //initialising the Chromedriver
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(3000);
		//firstName
		driver.findElement(By.name("firstname")).sendKeys("Kavya");
		//surname
		driver.findElement(By.name("lastname")).sendKeys("Ravindran");
		Thread.sleep(3000);
		//mobile number or email address
		driver.findElement(By.name("reg_email__")).sendKeys("9898989898");
		//new password
	    driver.findElement(By.id("password_step_input")).sendKeys("abcd_ABCD");
	    Thread.sleep(3000);
	    //dob
	    WebElement day=driver.findElement(By.id("day"));
	    Select Day=new Select(day);
	    Day.selectByIndex(8);
	    
	    WebElement month=driver.findElement(By.id("month"));
	    Select Month=new Select(month);
	    Month.selectByValue("9");
	    
	    WebElement year=driver.findElement(By.id("year"));
	    Select Year=new Select(year);
	    Year.selectByVisibleText("1992");
	    Thread.sleep(3000);
	    //gender
	   driver.findElement(By.cssSelector("input[value='1']")).click();
	   
	    // sign up
	    //driver.findElement(By.linkText("websubmit")).click();
		

	}

}
