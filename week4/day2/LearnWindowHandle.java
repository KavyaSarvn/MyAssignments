package week4.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.amazon.in/");
		//search for phone
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    System.out.println("Session address: " +driver);//output is the memory address which is dynamic
	   //Current Window Address
	    String parentWindow=driver.getWindowHandle();//this method is used to get the current window address
	    System.out.println("Window Address: "+parentWindow);
	    
	    driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
	    driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[3]")).click();
	    driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[15]")).click();
	    driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[14]")).click();
	    
	    
	    //to store multiple window handles we use set
	    Set<String> windowHandles=driver.getWindowHandles();
	    
	    //converting set to List
	    List<String> window= new LinkedList<String>(windowHandles);
	    
	 //   driver.switchTo().window(window.get(0));
	    for (String windowAdd:window)
	    {
	    	driver.switchTo().window(windowAdd);
	    
	    	System.out.println(driver.getTitle());
	    }
	    
	    
	System.out.println("=============================================================================================================");
	
	    driver.switchTo().window(parentWindow);
	    driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
	    driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[3]")).click();
	    driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[15]")).click();
	    driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[14]")).click();
	    //to store multiple window handles we use set
	    Set<String> windowHandles2=driver.getWindowHandles();
	    
	    //converting set to List
	    List<String> window2= new LinkedList<String>(windowHandles2);
	    
	    for (int i = 0; i < window2.size(); i++) // by iterating it will open in order 
	    {
	    	driver.switchTo().window(window2.get(i));
	    	System.out.println(driver.getTitle());
			
		}
	
	}

}
