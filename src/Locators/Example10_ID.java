package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example10_ID 
{
    public static void main(String[] args) 
    {
		WebDriver  driver=new ChromeDriver();
		//driver.get("file:///C:/Sandhya/Study%20material/html%20files/Name.html");
		 driver.get("file:///C:/Sandhya/Study%20material/html%20files/ID.html");
		//enter FN 
		  driver.findElement(By.id("1234")).sendKeys("abc"); 
		  
		//enter LN 
		  driver.findElement(By.id("5678")).sendKeys("xyz"); 
    
    
    }






}
