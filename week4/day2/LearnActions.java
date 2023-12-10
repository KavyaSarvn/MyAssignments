package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions action =new Actions(driver);
		WebElement mensFashion=driver.findElement(By.xpath(""));
		action.moveToElement(mensFashion).perform();
		Thread.sleep(5000);
		WebElement snapDealBus=driver.findElement(By.xpath(""));
		action.moveToElement(snapDealBus).perform();
		Thread.sleep(5000);
		action.moveToElement(snapDealBus).perform(); // most commonly used
		Thread.sleep(5000);
		action.scrollByAmount(0,200).perform(); // y axis positive moves downward
		Thread.sleep(5000);
		action.scrollByAmount(0,-50).perform();//y axis negative moves upward
		action.scrollByAmount(300,0).perform();//  x axis positive moves right
	
		
	//	action.dragAndDropBy(snapDealBus, 200, 0).perform();drop location -unknown
		//action.dragAndDropBy(drag,drop).perform();drop in known location
		
	/*Drag and Drop
	 * WebElement src=driver.findElement(By.xpath("")); 
	 * WebElement tgt=driver.findElement(By.xpath(""));
	 * actions.dragAndDrop(src,tgt).build(),perform();
	 */
		
		
	}

}
