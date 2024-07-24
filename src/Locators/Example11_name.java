package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example11_name 
{
   public static void main(String[] args) 
	    {
			WebDriver  driver=new ChromeDriver();
			driver.get("file:///C:/Sandhya/Study%20material/html%20files/Name.html");
		
	    
			//enter FN 
			  driver.findElement(By.name("xyz123")).sendKeys("abc");
	    
			//enter LN 
			  driver.findElement(By.name("xyz123")).sendKeys("xyz");  
	    
	    
	    
	    }	    
	    }
