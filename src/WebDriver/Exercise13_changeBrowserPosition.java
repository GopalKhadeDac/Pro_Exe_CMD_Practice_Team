package WebDriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise13_changeBrowserPosition 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	WebDriver   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(2000); 
		Dimension d=new Dimension(100, 100); 
		driver.manage().window().setSize(d); 
    
    
    
    
    
    
    
    }









}
