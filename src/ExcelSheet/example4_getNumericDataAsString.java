package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example4_getNumericDataAsString 
{

   public static void main(String[] args) throws IOException 
	    {
		
	     FileInputStream  file=new FileInputStream("C:\\Sandhya\\Study material\\Selenium\\3rd FebSelenium (version 1).xlsx");
	     String value=     WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
  	    
         System.out.println(value);

       ////convert double into String 





	    }
}
