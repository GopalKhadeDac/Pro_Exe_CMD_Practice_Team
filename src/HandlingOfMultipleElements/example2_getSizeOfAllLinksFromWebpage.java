package HandlingOfMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_getSizeOfAllLinksFromWebpage 
{
public static void main(String[] args) 
{
	WebDriver  driver= new  ChromeDriver();
    driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
   
    
  //  List<WebElement> allLinks = driver.findElements(By.xpath("//a")); 
//  int linkSize = allLinks.size(); 
//  System.out.println(linkSize); 
   
//  int linkSize = driver.findElements(By.xpath("//a")).size(); 
//  System.out.println(linkSize);
    

   System.out.println(driver.findElements(By.xpath("//a")).size());

}





}
