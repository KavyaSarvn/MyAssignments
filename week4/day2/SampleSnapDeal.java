package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleSnapDeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions act = new Actions(driver);
		WebElement mensFashion = driver.findElement(By.xpath("(//a/span[@class='catText'])[1]"));

		WebElement sportsShoes = driver.findElement(By.xpath("(//span[@class='linkTest'])[1]"));

		act.moveToElement(mensFashion).moveToElement(sportsShoes).click().build().perform();

		WebElement slider1=driver.findElement(By.xpath("//a[@class='price-slider-scroll left-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
		 act.dragAndDropBy(slider1, 100, 0).build().perform();
		System.out.println("slider done");
	}

}
