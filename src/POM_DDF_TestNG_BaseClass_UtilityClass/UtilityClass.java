package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	//selenium related common methods 
	  
	 //@Author Name:  Sanjay 
	 //This method is use to get Test Data from excel sheet
	//need pass 2 inputs, 1-rowIndex, 2-colIndex 
	public static String getTD(int rowIndex,int colIndex) throws IOException
     {
    	 FileInputStream file=new FileInputStream("C:\\Sandhya\\Study material\\Selenium\\3rd FebSelenium (version 1).xlsx"); 
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF"); 
		   
         String	value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();

         return value;
     }

	public static double getTDInt(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException  
	{
		FileInputStream file=new FileInputStream("C:\\Sandhya\\Study material\\Selenium\\3rd FebSelenium (version 1).xlsx"); 
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF"); 

		 double value = sh.getRow(rowIndex).getCell(colIndex).getNumericCellValue(); 
		   
		 return value;

	}

	 public static void captureSS(WebDriver driver,int TCID) throws IOException  
	 { 
	     File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	     File dest=new File("C:\\Users\\sandh\\eclipse-workspace\\3rd Feb Selenium\\FailedTCesSS\\TestCase" +TCID+ ".jpg"); 
	     FileHandler.copy(src, dest);

}

	public static String getPFData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\sandh\\eclipse-workspace\\3rd Feb Selenium\\PropertyFile.properties");
		Properties p=new Properties();
		p.load(file);
		return p.getProperty(key);		
	}

	
	
	
	}

