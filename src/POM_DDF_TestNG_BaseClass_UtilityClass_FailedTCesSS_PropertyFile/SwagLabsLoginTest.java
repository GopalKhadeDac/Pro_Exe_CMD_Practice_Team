package POM_DDF_TestNG_BaseClass_UtilityClass_FailedTCesSS_PropertyFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_DDF_TestNG.SwagLabsHomePage;
import POM_DDF_TestNG.SwagLabsLoginPage;
import POM_DDF_TestNG.SwagLabsOpenMenuPage;
import POM_DDF_TestNG_BaseClass_UtilityClass.UtilityClass;

//Test class using TestNG
public class SwagLabsLoginTest extends BaseClass
	{
	     
	   SwagLabsLoginPage login; 
	   SwagLabsHomePage home; 
	   SwagLabsOpenMenuPage openMenu; 
	    int TCID;
	  
	  
	 @BeforeClass 
	 public void openBrowser() throws EncryptedDocumentException, IOException  
	 { 
	   
	   initializeBrowser(); 
	   
	   login=new SwagLabsLoginPage(driver); 
	   home=new SwagLabsHomePage(driver); 
	   openMenu=new SwagLabsOpenMenuPage(driver); 
	   
	 } 
	  
	 @BeforeMethod 
	 public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException 
	 { 
	   
		  login.inpSwagLabsLoginPageUsername(UtilityClass.getPFData("UN")); 
		  Thread.sleep(2000); 
		  login.inpSwagLabsLoginPagePassword(UtilityClass.getPFData("PWD")); 
		  Thread.sleep(2000); 
		  login.clickSwagLabsLoginPageLogiBtn(); 
		  Thread.sleep(2000);
	 } 
	  
	 @Test 
	 public void verifyLogo() throws InterruptedException, IOException 
	 { 
	  
	   TCID=101;
	  Thread.sleep(2000); 
	  String actLogoText=home.getSwagLabsHomePageLogoText(); 
	  String expLogoText=UtilityClass.getTD(0, 2);  
	  Assert.assertEquals(actLogoText, expLogoText,"Failed- both results diff"); 
	 } 
	//  @Test
	//  public void TC2()
	//  {
	//	  nTCID=102;
	//  }
	//  @Test
	//  public void TC3()  
   //   { 
	//    TCID=103;
    //  }
	 
	  @AfterMethod 
	 public void logoutFromoApp(ITestResult s1) throws InterruptedException, IOException 
	 { 
	     if(s1.getStatus()==ITestResult.FAILURE)
	     {
		      UtilityClass.captureSS(driver, TCID);
	     }
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




















