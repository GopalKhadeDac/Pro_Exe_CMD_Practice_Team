package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_quit 
{  
	public static void main(String[] args) throws InterruptedException 
		
	{
	      WebDriver   driver=new  ChromeDriver();
	      Thread .sleep(2000);  //DiffClassName.methodName(time in mili sec); 
	       driver.get("https://en-gb.facebook.com/");
	       Thread.sleep(5000);  
	       driver.quit();
	
	
	
	
	}
}
