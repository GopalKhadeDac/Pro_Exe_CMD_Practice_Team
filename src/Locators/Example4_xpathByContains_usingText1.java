package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_xpathByContains_usingText1 
{

    public static void main(String[] args) throws InterruptedException 
    {
		WebDriver   driver=new  ChromeDriver();
	    driver.get("https://en-gb.facebook.com/");
          Thread.sleep(3000);
    
        //click on forgotten pwd link
	  
          driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
    
    }

}