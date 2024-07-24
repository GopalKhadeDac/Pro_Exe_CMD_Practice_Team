package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class example1_printAllLinksFromWebpage 
{
   public static void main(String[] args )
   
  {
	WebDriver  driver=new ChromeDriver();
    driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
   
   
   
  List<WebElement> allLinks = driver.findElements(By.xpath("//a")); 
  
  
  for(WebElement link:allLinks)
  {
		  System.out.println(link.getText());
 }
  
  
  
  } 
}
  
  
  
   
   
   
   
   

