package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example13_LinkText 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   WebDriver driver=new ChromeDriver();
	   driver.get("file:///C:/Sandhya/Study%20material/html%20files/LinkText.html");
	   
	   Thread.sleep(3000); 
	   
	   driver.findElement(By.linkText("facebook")).click();
	   

   
   
   
   
   }









}
