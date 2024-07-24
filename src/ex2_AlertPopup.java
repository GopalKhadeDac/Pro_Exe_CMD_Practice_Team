import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_AlertPopup 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	WebDriver driver=new  ChromeDriver();
    	driver.get("https://demo.guru99.com/test/delete_customer.php"); 
	
    	//enter customer ID on main page 
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("100");
    
        //click on submit btn main page 
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    
        //1: get text from alert popup 
    
        String     text=  driver.switchTo().alert().getText();
         System.out.println(text);
       Thread.sleep(3000);
       //2: click on Cancel btn from alert popup
      // driver.switchTo().alert().dismiss();
    
     //3: click on OK btn from 1st alert popup 
       driver.switchTo().alert().accept(); 
    
     //4: click on OK btn from 2nd alert popup 
       driver.switchTo().alert().accept(); 
    
    
    }









}
