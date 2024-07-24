package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
    public static void main(String[] args) throws InterruptedException 
    {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
        
	    Thread.sleep(3000);
       
	    driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
    
         Thread.sleep(2000);
    
    List<WebElement> allOptions= driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
    System.out.println(allOptions.size());
     
     
     String  expText="redmi note12";
   for(WebElement  s1 : allOptions)
   {
    		String  actText=s1.getText();
            System.out.println(actText);
       //    if(actText.equals(expText))
        //   {
        //	   s1.click();
        //	   break;
           //}
    
    
    
    }



    }



}
