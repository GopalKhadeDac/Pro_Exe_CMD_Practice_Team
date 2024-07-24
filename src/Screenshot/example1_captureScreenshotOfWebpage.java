package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class example1_captureScreenshotOfWebpage 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver   driver=new  ChromeDriver();
	   // driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
	    driver.get("https://www.google.com/");
	   
        File source= (( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      // System.out.println(source);
     
       
        File dest=new File("C:\\Sandhya\\Study material\\html files\\ScreenShot\\sandhya2.png");
        FileHandler.copy(source, dest);
	
	
	
	
	
	
	
	}

}
