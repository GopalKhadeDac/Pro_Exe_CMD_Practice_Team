package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_getTitle 
{
	public static void main(String[] args) 
	{
		WebDriver   driver=new  ChromeDriver();
	    driver.get("https://en-gb.facebook.com/");
	
	 //   String title = driver.getTitle();
	 //   System.out.println(title);
	
	    System.out.println(driver.getTitle());
	
	
	
	
	}








}
