package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1_getBooleanData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
	
      //navigate to excel path
    
      FileInputStream   file=new  FileInputStream("C:\\Sandhya\\Study material\\Selenium\\3rd FebSelenium (version 1).xlsx");

       boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();

       System.out.println(value);

	}
}
