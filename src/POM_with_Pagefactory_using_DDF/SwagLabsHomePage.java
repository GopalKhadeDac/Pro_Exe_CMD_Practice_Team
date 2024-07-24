package POM_with_Pagefactory_using_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//pom class 2
public class SwagLabsHomePage 
{
	 @FindBy(xpath="//div[text()='Swag Labs']")private WebElement logoText;
	 @FindBy(xpath="//input[@name='login-button']")private WebElement openMenuBtn;
	  
	  
	  public SwagLabsHomePage(WebDriver driver)
	  {
	      PageFactory.initElements(driver, this);
	  }

	  public void verifySwagLabsHomePageLogo(String expLogoText)  
	  {
	     String actLogoText= logoText.getText();
	     if(actLogoText.equals(expLogoText))	
		{
			System.out.println("TC Pass");
		}

		else
		{
			System.out.println("TC Fail");
		}
	}

	  public void clickSwagLabsHomePageOpenMenu()  
	   {
		  openMenuBtn.click();
	   }

	}

















