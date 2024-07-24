package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example14_partialLinkText 
{
	public static void main(String[] args) throws InterruptedException 
	 { 
	  WebDriver driver=new ChromeDriver();
      driver.get("file:///C:/Sandhya/Study%20material/html%20files/LinkText.html");

      Thread.sleep(3000); 
      
      driver.findElement(By.partialLinkText("book")).click();



	 }
}
