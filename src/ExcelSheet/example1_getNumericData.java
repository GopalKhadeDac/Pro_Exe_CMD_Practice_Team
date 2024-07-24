package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1_getNumericData 
{
    public static void main(String[] args) throws EncryptedDocumentException, IOException 
    {
    	//navigate to excel path 
	    FileInputStream   file=new   FileInputStream("C:\\Sandhya\\Study material\\Selenium\\3rd FebSelenium (version 1).xlsx");
    
        double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
    
        System.out.println(value);
    
    
    
    
    }









}
