package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 
		 WebElement frame1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		  driver.switchTo().frame(frame1);
		  Actions action =new Actions(driver);
		  WebElement Item1=driver.findElement(By.xpath("//li[text()='Item 1']")); 
		  WebElement Item3=driver.findElement(By.xpath("//li[text()='Item 3']"));
		  WebElement Item5=driver.findElement(By.xpath("//li[text()='Item 5']"));
		  WebElement Item7=driver.findElement(By.xpath("//li[text()='Item 7']"));
		  action.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item5).click(
		  Item7); action.perform();
		  
		 
		//Thread.sleep(5000);
	}

}
