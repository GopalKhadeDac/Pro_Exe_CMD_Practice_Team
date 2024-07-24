package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage1 
{
   @FindBy(xpath="//div[text()='Swag Labs']")private WebElement logoText;
   @FindBy(xpath="//button[@id='react-burger-menu-btn']")private WebElement openMenuBtn;


   
   public  SwagLabsHomePage1(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }

   public void veryLogo()
   {
	   String  actLogoText=logoText.getText();
	   String  expLogoText="Swag Labs";
      if(actLogoText.equals(expLogoText))
      {
    	  System.out.println("TC Pass");
      }
      else
      {
        System.out.println("TC Fail");
      }
   }   
      
      public void clickOnOpenBtn()
      {
        openMenuBtn.click();
      
      }
}
