package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example11_OpenNewWindow 
{
     



	public static void main(String[] args) throws InterruptedException 
     {
		WebDriver  driver=new  ChromeDriver();
	    driver.get("https://en-gb.facebook.com/");
     
	    Thread.sleep(3000); 
	    
	    driver.switchTo().newWindow(WindowType.WINDOW);    
	    driver.get("https://www.flipkart.com/");  
     
     
     
     }








}
