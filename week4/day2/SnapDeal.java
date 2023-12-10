package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions act = new Actions(driver);
		WebElement mensFashion = driver.findElement(By.xpath("(//a/span[@class='catText'])[1]"));

		WebElement sportsShoes = driver.findElement(By.xpath("(//span[@class='linkTest'])[1]"));

		act.moveToElement(mensFashion).moveToElement(sportsShoes).click().build().perform();

		/*
		 * WebElement ele1 =
		 * driver.findElement(By.xpath("//span[@class='category-name category-count']"))
		 * ; String count = ele1.getText();
		 */
		String countOfShoes = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
		System.out.println("Count of Sports Shoe  : " + countOfShoes);
		// training shoes
		WebElement trainingShoes = driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]"));
		trainingShoes.click();
		// sort
		WebElement sort = driver.findElement(By.xpath("//span[@class='sort-label']"));
		act.moveToElement(sort).click().build().perform();

		// sort Low to High
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		Thread.sleep(3000);
		// scrape the price list

		System.out.println("List is getting ready");

		List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));

		List<String> list = new ArrayList<String>();

		for (int i = 0; i < priceList.size(); i++) {

			WebElement priceList1 = priceList.get(i);
			String priceList2 = priceList1.getText();
			//Integer priceList3 = Integer.parseInt(priceList2.replaceAll("[^0-9]", "")); // parseInt converts String to integer
		    list.add(priceList2);

		}
		Collections.sort(list);
		System.out.println(list);
		
		// price range using slider
		WebElement leftSlider=driver.findElement(By.xpath("//a[@class='price-slider-scroll left-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
		 act.dragAndDropBy(leftSlider, 20, 0).build().perform();
		
		
		WebElement color=driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list '])[2]"));
		color.click();
		
	/*	if (color.isSelected())
		{System.out.println("filter applied");}
		
		else 
			{System.out.println("filter not applied");}*/
		
		//MouseHover on first training shoe
		
	WebElement firstShoe=driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"));
    act.moveToElement(firstShoe).perform();

    String parentWindow=driver.getWindowHandle();
    driver.findElement(By.xpath("(//div[@class='center quick-view-bar  btn btn-theme-secondary  '])[1]")).click();
  
    Thread.sleep(3000);
    
    /*the below part is not required as the above webelement doesn't open a new window so everything is commented*/
 //   Set<String> windowHandles=driver.getWindowHandles();
  //  List<String> window= new LinkedList<String>(windowHandles);
    
  //  driver.switchTo().window(window.get(1));
   String value= driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
   String percentage=driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
    Thread.sleep(3000);
    System.out.println("Price : "+value);
    System.out.println("Discount Percentage  : " + percentage);
    //screenshot
    
    File screenShot = driver.getScreenshotAs(OutputType.FILE);
    File location= new File("./snaps_maven/screenShot.png");
    FileHandler.copy(screenShot, location);
    
   /* File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File location= new File("./snaps_maven/screenShot.png");
	FileUtils.copyFile(screenShot, location);*/
    	driver.close();
    	driver.quit();
    	}
    
    
    
	}



