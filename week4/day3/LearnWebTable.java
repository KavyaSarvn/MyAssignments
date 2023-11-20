package week4.day3;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearnWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
	//	Actions key = new Actions(driver);
		WebElement toValue = driver.findElement(By.id("txtStationFrom"));
		toValue.clear();
		toValue.sendKeys("MAS"+Keys.ENTER);
		
		
		
		WebElement fromValue = driver.findElement(By.id("txtStationTo"));
		fromValue.clear();
		fromValue.sendKeys("MDU"+Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
        //when List<webelement> is used then findElements is used and not findElement
	     List<WebElement> trainName = driver.findElements(By.xpath("(//table)[2]/tbody/tr"));
		 System.out.println("List size : "+trainName.size());
	     Set<String> trainList = new TreeSet<String>();
		for (int i = 2; i <= trainName.size(); i++) 
		{

			String listOfTrain = driver.findElement(By.xpath("(//table)[2]/tbody/tr[" + i + "]/td[2]")).getText();
			trainList.add(listOfTrain);
			System.out.println(trainList);
			System.out.println("Set size : "+trainList.size());
		}

		
		  if((trainName.size()-1)==trainList.size()) 
		  
		  { 
			  System.out.println("There are no duplicates"); 
			  }
		  else 
		  { System.out.println("There are duplicates"); 
		 
		  }
		
		 

	}

}
