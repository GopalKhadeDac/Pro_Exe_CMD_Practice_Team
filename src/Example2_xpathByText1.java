import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_xpathByText1 
{
   public static void main(String[]args )
   {
      WebDriver driver=new ChromeDriver();

       driver.get("https://www.facebook.com/");
     //click on forgotten pwd link 
       driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();  

   }

}
//tagname[text()='Complete text value'] 

//a[text()='Forgotten password?']