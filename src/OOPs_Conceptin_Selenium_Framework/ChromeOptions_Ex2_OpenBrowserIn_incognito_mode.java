package OOPs_Conceptin_Selenium_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Ex2_OpenBrowserIn_incognito_mode 
{

   public static void main(String[] args) 
   {
	   ChromeOptions co=new ChromeOptions();
       co.addArguments("--incognito");
       WebDriver driver=new ChromeDriver(co); 
   
   
   
   
   
   
   
   }













}
