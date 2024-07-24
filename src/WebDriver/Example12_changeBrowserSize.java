package WebDriver;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example12_changeBrowserSize 
{  
	public static void main(String[] args) throws InterruptedException 
	{
		
	
	    WebDriver  driver=new  ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
 
        Thread.sleep(2000); 
       
       // Dimension d=new Dimension(100, 200);     //width, height 
      //  driver.manage().window().setSize(d); 
        org.openqa.selenium.Dimension d=new Dimension(100, 200);     //width, height 
        driver.manage().window().setSize(d); 
          
	}
}
