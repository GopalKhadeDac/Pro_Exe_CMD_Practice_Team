package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//pom class 3
public class SwagLabsOpenMenuPage 
{

  @FindBy(xpath="//button[text()='Open Menu']") private WebElement logout;

 public SwagLabsOpenMenuPage(WebDriver driver) 
  { 
	  PageFactory.initElements(driver, this); 
	 } 
	  
	 public void clickOnLogoutBtn()  
	 { 
	  logout.click();
	 }







}
