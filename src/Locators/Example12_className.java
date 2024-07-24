package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example12_className 
{
	public static void main(String[] args) 
	{	
	
	
	  WebDriver driver=new ChromeDriver(); 
	  driver.get("file:///C:/Sandhya/Study%20material/html%20files/ClassName.html");
	 
	   
	  //enter FN 
	  driver.findElement(By.className("abc123")).sendKeys("abc"); 
	   
	  //enter LN 
	  driver.findElement(By.className("abc123")).sendKeys("xyz"); 




}

}
