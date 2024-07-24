package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_SelectOption1_From_SingleSelectableListbox 

{
     public static void main(String[] args) throws InterruptedException 
   {
	      WebDriver  driver=new ChromeDriver();
          driver.get  (" https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
          
          Thread.sleep(3000);
          
          //click on"Sign up For Facebook"Link
           driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
   
           Thread.sleep(3000);
   
          //step1:
            WebElement    month=driver.findElement(By.xpath("//select[@id='month']"));
    
        
         //step2:
          Select  s=new  Select(month);
        
          //step3:
         // s.selectByVisibleText("Dec");       //String text
         // s.selectByValue("1");                 //String value
          s.selectByIndex(3);                   //int index
   
   
   
   }





}
