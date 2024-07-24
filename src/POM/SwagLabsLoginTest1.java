package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginTest1 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver   driver=new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.manage().window().maximize();
  
    SwagLabsLoginPage1  login=new  SwagLabsLoginPage1(driver);
    login.enterUN();
    login .enterPWD();
    Thread.sleep(2000);
    login.clickOnLoginBtn();
    Thread.sleep(2000);
  
    SwagLabsHomePage1 home=new SwagLabsHomePage1(driver); 
    home.veryLogo(); 
    home.clickOnOpenBtn(); 
    Thread.sleep(2000); 
  
    SwagLabsOpenMenuPage1 openMenu=new SwagLabsOpenMenuPage1(driver); 
    openMenu.clickOnLogoutBtn();
  
    Thread.sleep(2000); 
    driver.quit(); 
  }
  
}
  
  
  
  
  











