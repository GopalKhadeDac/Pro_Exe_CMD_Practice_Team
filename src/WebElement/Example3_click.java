package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Example3_click 
{
	public static void main(String[] args) throws InterruptedException { 
		   
		  WebDriver driver=new ChromeDriver(); 
		  driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");

		     
		  //click on create new acc link 
		  driver.findElement(By.xpath("//a[text()='Create new account']")).click(); 
		   
		  Thread.sleep(2000); 
		     
		  //click on male radio btn 
		  driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();  






	}

}
