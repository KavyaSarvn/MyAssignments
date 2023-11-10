package week3.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
	
		
		//search for phone
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    
		//price
	     List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	     List <Integer> price=new ArrayList<Integer>();
	     
	     
	     for(int i=0;i<list.size();i++) 	 
	     {
	    	 WebElement element=list.get(i); //get(),getText() are the methods of webelement
	             String priceList=element.getText(); //getText asserts/declares the webelement value, it removes the white space present in front and back of the string
	             Integer priceList1=Integer.parseInt(priceList.replaceAll("[^0-9]","")); //parseInt converts String to Integer
	             price.add(priceList1);
	 			
				}
	     Collections.sort(price);
	     System.out.println(price);
	     System.out.println("Lowest Price : "+price.get(0));
	     
	     
	   
	}
}