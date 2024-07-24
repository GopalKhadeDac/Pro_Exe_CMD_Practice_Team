package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex2_mouseRightClickAction 
{
   public static void main(String[] args) 
   {
	   WebDriver driver = new ChromeDriver(); 
	   driver.manage().window().maximize(); 
       driver.get("https://www.ebay.com/"); 
       
       WebElement  sell=driver.findElement(By.xpath("//a[text()=' Sell']"));
       Actions act=new Actions(driver); 
      
       //approach1 
      // act.moveToElement(sell).perform();
      // act.contextClick().perform();
     
       //approach2
      // act.moveToElement(sell).contextClick().perform();
   
       
       //approach3
       act.contextClick(sell).perform();
   
   }
}
   
   
   


















