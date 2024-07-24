package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex1_HandlingDropdown 
{     
	public static void main(String[] args) throws InterruptedException 
	{
	    WebDriver   driver=new  ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.co.uk/");

        //step1: 
        WebElement eBay =driver.findElement(By.xpath("//a[text()='My eBay']"));

        //Step2:  
         Actions act=new Actions(driver); 
         
         //step3:  
         act.moveToElement(eBay).perform(); 
	
         Thread.sleep(3000); 
	
       //click on Watchlist link from dropdown 
         driver.findElement(By.xpath("//a[text()=' Watch List']")).click();
	
	
	
	
	
	
	}
}
