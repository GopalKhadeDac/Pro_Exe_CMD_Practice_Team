package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex5_mouseDragAndDropAction 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	  WebDriver driver = new ChromeDriver(); 
          driver.manage().window().maximize(); 
          driver.get("https://demo.guru99.com/test/drag_drop.html"); 
           Thread.sleep(5000);
          WebElement srcEle = driver.findElement(By.xpath("//li[@class='block13 ui-draggable']")); 
          WebElement destEle = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]")); 
          
          
          //   WebElement destEle = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]")); 
           
          Actions act=new Actions(driver); 
        //  act.dragAndDrop(srcEle, destEle).perform();
    
    
    
   act.moveToElement(srcEle).clickAndHold().moveToElement(destEle).release().perform();
    
    
    
    
    }












}
