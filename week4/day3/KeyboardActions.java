package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:leafground.com/input.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions key=new Actions(driver);
		//press the key -->keydown
		//release the key--> key Up
		WebElement clrValue=driver.findElement(By.name("j_idt88:j_idt95"));
		key.click(clrValue)
		.keyDown(Keys.SHIFT).keyDown(Keys.HOME)
		.keyUp(Keys.SHIFT).keyUp(Keys.HOME)
		.keyDown(Keys.BACK_SPACE).pause(5).keyDown(Keys.BACK_SPACE)
		.perform();
		
		
		
	}

	

}
