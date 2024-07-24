package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class example3_selectMultipleCheckboxes 
{
	public static void main(String[] args) throws InterruptedException 

		{			

          WebDriver  driver=new  ChromeDriver();
          driver.get("file:///C:/Sandhya/Study%20material/html%20files/Checkbox.html");


          List<WebElement>  allCheckboxes =  driver.findElements(By.xpath("//input[@type='checkbox']"));
          for(WebElement checkbox:allCheckboxes) 
          { 
             checkbox.click(); 
              Thread.sleep(500);
          }
		
		
		
		
		
		
		
		
		}
	



}