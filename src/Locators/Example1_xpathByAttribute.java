package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_xpathByAttribute 
{
	public static void main(String[] args) throws InterruptedException 
	 { 
	  WebDriver driver=new ChromeDriver(); 
	  driver.get("https://www.facebook.com/"); 
	   Thread.sleep(5000);
	//  driver.findElement(By.xpath("//button[@title='Decline optional cookies']")).click();
	   
	   
	  
	  //driver.findElement(locator type) 
	  //driver.findElement(By.xpath("xpath Expression")) 
	   
	//enter UN 
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc123");   
	  
	  //enter pwd 
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc@123"); 
	   
	  //click on login btn 
	  driver.findElement(By.xpath("//button[@name='login']")).click();
	 
	 
	 
	 }
}