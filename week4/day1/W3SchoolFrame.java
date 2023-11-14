package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		
		
		  WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		  driver.switchTo().frame(frame);// to handle the frame, we have to switch to frame using webelement
		 
		
		driver.findElement(By.xpath("//h2[text()='JavaScript Confirm Box']/following::button")).click();
		
		
		Alert ale=driver.switchTo().alert();
	    ale.accept();
	    String Text=driver.findElement(By.xpath("//p[@id='demo']")).getText();
	    System.out.println(Text);
		
	}

}
