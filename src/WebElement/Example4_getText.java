package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_getText 
{
    public static void main(String[] args) 
    {
    	  WebDriver driver=new ChromeDriver(); 
    	  driver.get("https://en-gb.facebook.com/");
	
          String  text = driver.findElement(By.xpath("//a[text()='Forgotten account?']")).getText();
          System.out.println(text);
    
    
    
    
    
    
    }

}





