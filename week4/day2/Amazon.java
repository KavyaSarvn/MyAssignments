package week4.day2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//price of the product
		WebElement price=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		System.out.println(price.getText());
		//no. of review
		WebElement review=driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
		System.out.println(review.getText());
		
		driver.findElement(By.linkText("(Refurbished) OnePlus 9 Pro 5G (Pine Green, 12GB RAM, 256GB Storage)")).click();
		//now there are two windows, in order to work on the second window, we have to switch the window//
		String parentWindow=driver.getWindowHandle();// First main window
		Set<String> allWindows=driver.getWindowHandles();// all the opened windows
		for(String a:allWindows)
		{
			driver.switchTo().window(a);
		}
		
		//screen shot part yet to cover//
		
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		Actions acc=new Actions(driver);
		WebElement subtotal=driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
		String total=subtotal.getText();
		System.out.println(total);
		
		
		
		
		/*
		 * if (price==subtotal) { System.out.
		 * println("Verified, the subtotal is same as the price of the product"); } else
		 * {System.out.println("The subtotal is not same as the price of the product");}
		 * 
		 * driver.close();
		 */
	}

}
