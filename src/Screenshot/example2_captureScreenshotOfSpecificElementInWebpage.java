package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example2_captureScreenshotOfSpecificElementInWebpage 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	      WebDriver    driver=new  ChromeDriver();
          driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
	
	       Thread.sleep(3000);
	//File src= driver.findElement(By.xpath(("//img[@alt='Facebook']")).getScreenshotAs(OutputType.FILE);
	
	
         WebElement logo=  
      driver.findElement(By.xpath("//img[@alt='Facebook']")); 
	    File  src=logo.getScreenshotAs(OutputType.FILE);
	
	 File dest=new File("C:\\Sandhya\\Study material\\html files\\ScreenShot//logo.png");
	 FileHandler.copy(src, dest);
	
	
	}          
	
	
	
}