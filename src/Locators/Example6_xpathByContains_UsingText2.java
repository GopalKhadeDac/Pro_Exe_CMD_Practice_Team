package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_xpathByContains_UsingText2 
{
     public static void main(String[] args) throws InterruptedException 
     {
    	 WebDriver   driver=new  ChromeDriver();
 	     driver.get("https://en-gb.facebook.com/");
         
 	     Thread.sleep(3000);
       
         
         //click on Create New Acc link 
		
	        
 	   // driver.findElement(By.xpath("//a[contains(text(),'new')]")).click();
     
 	
     
     }








}
