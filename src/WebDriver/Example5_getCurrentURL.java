package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_getCurrentURL 
{

   public static void main(String[] args) 
   {
	     WebDriver  driver=new  ChromeDriver();
         driver.get("https://en-gb.facebook.com/");
        
      //   String   url= driver.getCurrentUrl(); 
       //  System.out.println(url);
   
         System.out.println(driver.getCurrentUrl());
   }








}
