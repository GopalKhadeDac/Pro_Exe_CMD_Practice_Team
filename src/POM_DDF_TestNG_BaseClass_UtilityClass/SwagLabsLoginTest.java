package POM_DDF_TestNG_BaseClass_UtilityClass;

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

import POM_DDF_TestNG.SwagLabsHomePage;
import POM_DDF_TestNG.SwagLabsLoginPage;
import POM_DDF_TestNG.SwagLabsOpenMenuPage; 

	public class SwagLabsLoginTest extends BaseClass
	{

		 SwagLabsLoginPage login; 
		 SwagLabsHomePage home; 
		 SwagLabsOpenMenuPage openMenu; 
		
		  
		  
		 @BeforeClass 
		 public void openBrowser() throws EncryptedDocumentException, IOException  
		 { 
		   
		   initializeBrowser(); 
		   
		   login=new SwagLabsLoginPage(driver); 
		   home=new SwagLabsHomePage(driver); 
		   openMenu=new SwagLabsOpenMenuPage(driver); 
		   
		 } 
		  
		 @BeforeMethod 
		 public void loginToApp() throws InterruptedException, IOException 
		 { 
		   
		  login.inpSwagLabsLoginPageUsername(UtilityClass.getTD(0, 0)); 
		  Thread.sleep(2000); 
		  login.inpSwagLabsLoginPagePassword(UtilityClass.getTD(1, 1));  
		  Thread.sleep(2000); 
		  login.clickSwagLabsLoginPageLogiBtn(); 
		  Thread.sleep(2000); 
		 } 
		  
		 @Test 
		 public void verifyLogo() throws InterruptedException, IOException 
		 { 
		  
		   
		  Thread.sleep(2000); 
		  String actLogoText=home.getSwagLabsHomePageLogoText(); 
		  String expLogoText=UtilityClass.getTD(0, 2);  
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









