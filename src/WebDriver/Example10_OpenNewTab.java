package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example10_OpenNewTab 
{

    public static void main(String[] args) throws InterruptedException 
    {
		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.google.co.uk/");
    
	      
	      Thread.sleep(3000); 
    
           driver. switchTo().newWindow(WindowType.TAB);
           driver.get("https://www.flipkart.com/");
         //driver.quit();
    }






}
