package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example9_Tagname 
{
public static void main(String[] args) 
{
	   WebDriver driver=new  ChromeDriver();
       driver.get("file:///C:/Sandhya/Study%20material/html%20files/Tagname.html");
        
       
       //enter FN
      driver.findElement(By.tagName("input")).sendKeys("sandhya"); 
       
    //  enter LN
      driver.findElement(By.tagName("input")).sendKeys("Sharma"); 





}

}
