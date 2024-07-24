package POM_with_Pagefactory_using_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//Test class or main class
public class SwagLabsLoginTest1 
{
   public static void main(String[] args) throws IOException, InterruptedException 
   {
	  FileInputStream  file=new FileInputStream("C:\\Sandhya\\Study material\\Selenium\\3rd FebSelenium (version 1).xlsx");
      Sheet sh= WorkbookFactory.create(file).getSheet("DDF");
    
      WebDriver   driver=new ChromeDriver();
      driver.get("https://www.saucedemo.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.manage().window().maximize();
    
      SwagLabsLoginPage  login=new  SwagLabsLoginPage(driver); //early or basic initialization 
      login.inpSwagLabsLoginPageUsername(sh.getRow(0).getCell(0).getStringCellValue()); 
      Thread.sleep(2000); 
      login.inpSwagLabsLoginPagePassword(sh.getRow(1).getCell(1).getStringCellValue()); 
      Thread.sleep(2000); 
      login.clickSwagLabsLoginPageLogiBtn(); 
      Thread.sleep(2000); 
    
      SwagLabsHomePage home=new SwagLabsHomePage(driver); 
      home.verifySwagLabsHomePageLogo(sh.getRow(0).getCell(2).getStringCellValue());
      Thread.sleep(2000); 
      home.clickSwagLabsHomePageOpenMenu(); 
      Thread.sleep(2000);
      
      
      SwagLabsOpenMenuPage openMenu=new SwagLabsOpenMenuPage(driver); 
      Thread.sleep(2000);
      openMenu.clickSwagLabsOpenMenuPageLogout(); 
      
      Thread.sleep(2000); 
      driver.quit(); 
   }  
}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
       






















