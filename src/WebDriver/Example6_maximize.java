package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_maximize 
{
   public static void main(String[] args) throws InterruptedException 
   {
	  WebDriver  driver=new     ChromeDriver();
	  
	    Thread.sleep(3000);
   
	    driver.manage().window().maximize(); 
   
	//  Options s1 = driver.manage(); 
	//  Window s2 = s1.window(); 
	//  s2.maximize();  
   
   
   
   
   
   }







}
