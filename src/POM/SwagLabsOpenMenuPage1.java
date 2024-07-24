package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsOpenMenuPage1 
{
    @FindBy(xpath = "//a[text()='Logout']")private  WebElement logout;
  
    public SwagLabsOpenMenuPage1(WebDriver driver)
    {
    	PageFactory.initElements(driver,this );
    }
   
    public void clickOnLogoutBtn()
    {
    	logout.click();
    }






}
