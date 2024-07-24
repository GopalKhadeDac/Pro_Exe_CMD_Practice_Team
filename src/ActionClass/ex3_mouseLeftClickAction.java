package ActionClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ex3_mouseLeftClickAction 
{
   public static void main(String[] args) throws InterruptedException 
   {
	  WebDriver  driver=new  ChromeDriver();
	  driver.manage().window().maximize(); 
      driver.get("https://www.ebay.com/");
   
      WebElement signIn = driver.findElement(By.xpath("(//a[text()='Sign in'])[1]")); 
      Actions act=new Actions(driver); 
   
      act.moveToElement(signIn).perform(); 
      act.click().perform(); 
      
//    act.moveToElement(signIn).click().perform(); 
      
      // act.click(signIn).perform(); 
   
   } 
   
   }  
     













