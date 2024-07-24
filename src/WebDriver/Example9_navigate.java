package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example9_navigate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	    WebDriver driver=new ChromeDriver(); 
	    Thread.sleep(2000); 
	    driver.navigate().to("https://www.facebook.com/"); 
	    Thread.sleep(2000); 
	    driver.navigate().to("https://www.google.com/"); 
	    Thread.sleep(3000); 
	    driver.navigate().back(); 
	    Thread.sleep(3000); 
	    driver.navigate().forward(); 
	    Thread.sleep(5000); 
	    driver.navigate().refresh(); 
	       
	    //Navigation s1 = driver.navigate();
	
	}
	}