package Framework;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_WithDDF 
{
	public static void main(String[] args) throws IOException, InterruptedException {
	
	       FileInputStream  file=new FileInputStream("C:\\Sandhya\\Study material\\Selenium\\3rd FebSelenium (version 1).xlsx");
           Sheet sh= WorkbookFactory.create(file).getSheet("DDF");
    
    
           WebDriver    driver=new   ChromeDriver();
           driver.get("https://www.saucedemo.com/"); 
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
           driver.manage().window().maximize();
   
           //enter UN
           String Username=sh.getRow(0).getCell(0).getStringCellValue();
           driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Username);
           Thread.sleep(2000);

           //enter PWD 
           String  password = sh.getRow(0).getCell(1).getStringCellValue();
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








	


