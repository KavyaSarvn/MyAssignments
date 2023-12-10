package week4.day2;

/****The program did not run because of application issue*****/
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.nykaa.com/");
			driver.manage().window().maximize();
			
			Actions hover=new Actions(driver);
			hover.moveToElement(driver.findElement(By.xpath("//li/a[text()='brands']")))
			     .moveToElement(driver.findElement(By.xpath("//input[@id='brandSearchBox']")))
			     .click()
			     .sendKeys("L'Oreal Paris")
			      .build()
			     .perform();
			//div[@class='css-150nd8c']/a
			
		// driver.findElement(By.xpath("(//div[@class='ss-wrapper']//a)[1]")).click();
			
		  driver.findElement(By.linkText("L'Oreal Paris")).click();
		  String title= driver.getTitle();
		  System.out.println(title);
		  if(title.contains("L'Oreal Paris"))
			  {System.out.println("Title : "+ title);
			  }
		  
		 driver.findElement(By.xpath("//button[@class=' css-1aucgde']")).click();
	     driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		       
		      driver.findElement(By.xpath("//span[text()='Category']")).click();
		      driver.findElement(By.xpath("//span[text()='Hair']")).click();
		      driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		      driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		      driver.findElement(By.xpath("//span[text()='Concern']")).click();
		      driver.findElement(By.xpath("//span[text()='Colour Protection']")).click();
		        
		        
          WebElement value=driver.findElement(By.xpath("(//div[@class='css-rtde4j']//span)[1]"));
        
           String val=value.getText();
           if(val.contains("Shmpoo"))
			  {System.out.println("Filtered value is : "+ val);
			  }
           
 
		
	driver.findElement(By.xpath("//div[@class='css-43m2vm']/img")).click();
		  
		  
					Set<String> allWindows=driver.getWindowHandles();// all the opened windows
					for(String a:allWindows)
					{
						driver.switchTo().window(a);
					}	  
				  
					 hover.moveToElement(driver.findElement(By.xpath("//span[text()='180ml']"))).click().perform();	
					
					 System.out.println(driver.findElement(By.xpath("(//div[@class='css-1d0jf8e']//span[@class='css-1jczs19'])[1]")).getText());
					
					  
					 hover.moveToElement(driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")))	
					  .moveToElement(driver.findElement(By.xpath("//button[@class='css-aesrxy']")))	
					  .click()
					  .perform();
					  
					  WebElement price=driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']"));
							  price.getText();	
					  System.out.println(price);
					  
					  hover.moveToElement(driver.findElement(By.xpath("//div[@class='css-15vhhhd e25lf6d4']")))	
					  .moveToElement(driver.findElement(By.xpath("//button[text()='Continue as guest']")))
					  .click()
					  .perform();
					  WebElement finalPrice=driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']"));
					  finalPrice.getText();
					  
					  System.out.println(finalPrice);
					  
					  if(finalPrice.equals(price))
						{
							System.out.println("The amounts are matching");
						}
									
									
									
									
			
	}

}
