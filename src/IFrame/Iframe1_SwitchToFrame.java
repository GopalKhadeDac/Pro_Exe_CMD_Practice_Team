package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1_SwitchToFrame 
{ 
	public static void main(String[] args) {
		
	
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst"); 
         
        //switch to frame 
        //driver.switchTo().frame("iframeResult");    //String frameID
        //driver.switchTo().frame("iframeResult");     //String frameID
        //  driver.switchTo().frame( driver.findElement(By.xpath("//iframe[@id='iframeResult']"))); //frame webElement
         driver.switchTo().frame(0);      //int frameIndex
        
        
         //click on "Click me to display Date and Time"  btn 
          driver.findElement(By.xpath("//button[@type='button']")).click();





	}

}
