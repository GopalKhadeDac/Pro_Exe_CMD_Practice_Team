package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example11_Parallel3 
{   
	@Test
	public void OpenFlipkartApp() throws InterruptedException  
	 { 
	  Reporter.log("--Open flipkart App--", true); 
	  WebDriver driver=new ChromeDriver(); 
	  driver.get("https://www.flipkart.com/"); 
	  Thread.sleep(5000); 
	  driver.quit(); 
	 } 








}