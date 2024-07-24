package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example5_isMultiple1 
{ public static void main(String[] args) throws InterruptedException
{
	  WebDriver  driver=new  ChromeDriver();
      driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
      
      
     // driver.findElement(By.xpath("//a[text()='Create new 
    	//	  account']")).click(); 
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
        
        Thread.sleep(3000);
        
        
        WebElement  month=driver.findElement(By.xpath("//select[@id='month']"));
        Select   s=new  Select(month);
   
         boolean  result =s.isMultiple();
       if(result)
    	   
       {
    	   
    	   System.out.println("Listbox is of multi-selectable");
       }
       else
       {
    	   System.out.println("Listbox is of single-selectable");
       }
} 

}
