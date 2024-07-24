package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex2_ScrollUpDown2 
{
     public static void main(String[] args) throws InterruptedException 
     {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/"); 
	    Thread.sleep(2000); 
     
	    Actions act=new Actions(driver); 
        Thread.sleep(3000);
	 
        // scroll down  (2nd para +Ve value) 
	     act.scrollByAmount(0, 300).perform();
      
        Thread.sleep(2000);
	     
	   //scroll up  (2nd para -Ve value) 
        act.scrollByAmount(0, -50).perform(); 
        
	  //scroll right  (1st para +Ve value) 
	   act.scrollByAmount(200, 0).perform(); 
	    
        Thread.sleep(2000);   
     
	  //scroll left  (1st para -Ve value) 
	   act.scrollByAmount(-50, 0).perform(); 
     
     }
     }
     
     
     
     
     
     
     
     
     
     












