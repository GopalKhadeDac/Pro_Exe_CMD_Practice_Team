package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_xpathByCointains_UsingAttribute 
{
    public static void main(String[] args) 
    {
    	WebDriver  driver=new ChromeDriver();
    	driver.get("https://en-gb.facebook.com/");
		
	    //enter UN
    	 driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("sandhya"); 
    
    
    	//enter PWD 
    	  driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]")).sendKeys("sharma"); 




}

}
