package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_HiddenDivisionPopup 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   WebDriver    driver= new  ChromeDriver();
       driver.get("https://www.nobroker.in/");
       
       //click on login btn from main page 
       driver.findElement(By.xpath("(//div[text()='Log in'])[1]")).click();
   
        Thread.sleep(2000);
        
        //enter mob num in Hidden division popup 
        driver.findElement(By.xpath("//input[@ id='signUp-phoneNumber']"))	.sendKeys("7776831956");
   }
}
