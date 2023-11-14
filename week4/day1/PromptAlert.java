package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		
		
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert prompt=driver.switchTo().alert();// to handle the frame, we have to switch to frame using index
		prompt.sendKeys("Kavya");
		prompt.accept();
		
		driver.switchTo().defaultContent(); // to switch back from frame to main page. bcz the text is not inside the frame
		String text=driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text);
		 
		
		
		
		
		
	}

}
