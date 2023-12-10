package week4.day2;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://www.irctc.co.in/");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//a[text()=' FLIGHTS '] ")).click();
			
			Set<String> windowHandles=driver.getWindowHandles();
		    List<String> window= new ArrayList<String>(windowHandles);
			String title=driver.switchTo().window(window.get(1)).getTitle();
			System.out.println(title);
			
			// to close the first window
			driver.switchTo().window(window.get(0)).close();
			
			
	}

}
