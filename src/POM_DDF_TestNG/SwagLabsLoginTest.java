package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsLoginTest 
{

	 int a;     
	 SwagLabsLoginPage login; 
	 SwagLabsHomePage home; 
	 SwagLabsOpenMenuPage openMenu; 
	 Sheet sh; 
	 WebDriver driver; 
	  
	 @BeforeClass 
	 public void openBrowser() throws EncryptedDocumentException, IOException  
	 { 
	  FileInputStream file=new FileInputStream("C:\\Sandhya\\Study material\\Selenium\\3rd FebSelenium (version 1).xlsx"); 
	
	  sh = WorkbookFactory.create(file).getSheet("DDF"); 
	   
	  driver=new ChromeDriver(); 
	  driver.manage().window().maximize(); 
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	  driver.get("https://www.saucedemo.com/"); 
	   
	   login=new SwagLabsLoginPage(driver); 
	   home=new SwagLabsHomePage(driver); 
	   openMenu=new SwagLabsOpenMenuPage(driver); 
	   a=10; 
	 } 
	  
	 @BeforeMethod 
	 public void loginToApp() throws InterruptedException 
	 { 
	  System.out.println(a); 
	  login.inpSwagLabsLoginPageUsername(sh.getRow(0).getCell(0).getStringCellValue()); 
	  Thread.sleep(2000); 
	  login.inpSwagLabsLoginPagePassword(sh.getRow(1).getCell(1).getStringCellValue()); 
	  Thread.sleep(2000); 
	  login.clickSwagLabsLoginPageLogiBtn(); 
	  Thread.sleep(2000); 
	 } 
	  
	 @Test 
	 public void verifyLogo() throws InterruptedException 
	 { 
	  //home.verifySwagLabsHomePageLogo(sh.getRow(0).getCell(2).getStringCellValue()); 
	   
	  Thread.sleep(2000); 
	  String actLogoText=home.getSwagLabsHomePageLogoText(); 
	  String expLogoText=sh.getRow(0).getCell(2).getStringCellValue(); 
	  Assert.assertEquals(actLogoText, expLogoText,"Failed- both results diff"); 
	 } 
	  
	  
	 @AfterMethod 
	 public void logoutFromoApp() throws InterruptedException 
	 { 
	  home.clickSwagLabsHomePageOpenMenu(); 
	  Thread.sleep(2000); 
	  openMenu.clickSwagLabsOpenMenuPageLogout();
	  Thread.sleep(2000); 
	 }
	  
	  @AfterClass 
	  public void closeBrowser()  
	  { 
	   driver.quit(); 
	  }



















}
