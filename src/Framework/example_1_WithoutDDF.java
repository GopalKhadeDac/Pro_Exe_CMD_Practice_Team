package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_1_WithoutDDF 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver    driver=new  ChromeDriver();
	     driver.get("https://www.saucedemo.com/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     driver.manage().window().maximize();
	
	      //enterUN
	     driver.findElement(By.xpath("// input[@type='text']")).sendKeys("standard_user");
	     Thread.sleep(2000);
	
	
	    //enter PWD
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	     Thread.sleep(2000);
	   
	     //click on login btn
	     driver.findElement(By.xpath("//input[@name='login-button']")).click();
	     Thread.sleep(3000);
	
         String	 actLogoText=   driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
	     String   expLogoText="Swag Labs";
	
	
	     if(actLogoText.equals(expLogoText))
	     {
	    	 System.out.println("TC Pass");
	     }
	
	     else
	     {
	    	 System.out.println("Tc Fail");
	     }
	
	     //click on menu btn
         driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
         Thread.sleep(2000);
        
         //click on log out btn 
         driver.findElement(By.xpath("//a[text()='Logout']")).click();
         Thread.sleep(2000); 

         driver.quit();
	}

}












