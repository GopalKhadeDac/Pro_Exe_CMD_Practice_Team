package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_xpathByText1 
{ 
	public static void main(String[]args) throws InterruptedException
	{
        WebDriver   driver =new  ChromeDriver();
       // driver.get("https://www.facebook.com/"); 
          Thread.sleep(5000);
        
         //click on forgotten pwd link
       // driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click(); 

      driver.get("https://en-gb.facebook.com/");
}    //  driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
	
}
