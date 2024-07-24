package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex6_ScrollUpDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver  driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.facebook.com/");
         Thread.sleep(2000);
        
         WebElement  signUp =driver.findElement(By.xpath("//a[text()='Sign Up']"));
         Thread.sleep(3000);
     
         Actions  act=new   Actions(driver);
         act.scrollToElement(signUp).perform();
      
}
}
