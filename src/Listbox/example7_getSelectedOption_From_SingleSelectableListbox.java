package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example7_getSelectedOption_From_SingleSelectableListbox 
{   
	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver =new  ChromeDriver();
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
	      
		 Thread.sleep(3000);
		 //click on "Sign up for Facebook" link 
		 driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	
	   Thread.sleep(3000);
	   WebElement    month= driver .findElement(By.xpath("//select[@id='month']"));
	   Select   s=new Select(month);
	 
	//WebElement  selectedOption=s.getFirstSelectedOption();
	//String text=selectedOption.getText();
	//System.out.println(text);
	
	//String text=s.getFirstSelectedOption();
	//System.out.println(text);
		
	System.out.println(s.getFirstSelectedOption().getText());
	
	
	}








}
