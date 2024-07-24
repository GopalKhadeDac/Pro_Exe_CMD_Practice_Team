package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_clear 
{
	public static void main(String[] args) throws InterruptedException { 
		   
		  WebDriver driver=new ChromeDriver(); 
		  driver.get("https://en-gb.facebook.com/");
		  		
		   
		   
		
		// driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sandhya"); 
		//  Thread.sleep(2000); 
		//  driver.findElement(By.xpath("//input[@name='email']")).clear(); 
		//  Thread.sleep(2000); 
		 
		 //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rinkoo"); 
		   
		   
		  WebElement un = 
		  driver.findElement(By.xpath("//input[@name='email']")); 
		  un.sendKeys("sandhya"); 
		  Thread.sleep(5000); 
		  un.clear(); 
		  Thread.sleep(2000); 
		  un.sendKeys("rinkoo");    
		 }









}
