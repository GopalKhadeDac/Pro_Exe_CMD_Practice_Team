package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_AlertPopup2 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/delete_customer.php"); 
  
	//enter customer ID on main page 
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("100");
	  
	  Thread.sleep(3000);
	
	  //click on submit btn main page 
	  driver.findElement(By.xpath("//input[@type='submit']")).click();

	 //switch to alert popup 
      Alert  alt= driver.switchTo().alert();
       
      //1: get text from alert popup 
        String text = alt.getText(); 
        System.out.println(text); 
  
      //2: click on Cancel btn from alert popup 
       // alt.dismiss(); 
  
      //3: click on OK btn from 1st alert popup 
        alt.accept(); 
         
        //3: click on OK btn from 2nd alert popup 
        alt.accept(); 
         
        //4: enter value in alert popup 
       // alt.sendKeys("999999999"); 
  }
















}
