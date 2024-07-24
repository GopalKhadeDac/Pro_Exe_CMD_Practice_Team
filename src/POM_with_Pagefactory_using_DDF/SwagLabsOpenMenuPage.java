package POM_with_Pagefactory_using_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//pom class 3
public class SwagLabsOpenMenuPage 
{

	 @FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement logout;
	//@FindBy(xpath = "//a[@id='logout_sidebar_link']") private WebElement logout;
	 public SwagLabsOpenMenuPage(WebDriver driver) 
	 { 
		  PageFactory.initElements(driver, this); 
	 } 
		  
	 public void clickSwagLabsOpenMenuPageLogout()  
	 { 
		  logout.click();
     }



















}
