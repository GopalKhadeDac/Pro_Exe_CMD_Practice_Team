package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1_getStringData 
{
   public static void main(String[] args) throws EncryptedDocumentException, IOException 
	   {
	    //navigate to excel path 
        FileInputStream  file=new   FileInputStream("C:\\Sandhya\\Study material\\Selenium\\3rd FebSelenium (version 1).xlsx");

        String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
  
	   System.out.println(data);
	   
	   //open excel
	   // Workbook book=WorkbookFactory.create(file);   // ClassName.methodname();
	  
	   //navigate to specific sheet in a excel 
	   // Sheet sh=book.getSheet("Sheet1");
	   
	  //navigate to specific row in a sheet 
	 //  Row rw=sh.getRow(1);
	   
	 //navigate to specific col in a row 
	 //  Cell cl=rw.getCell(0);
  
	//get String data  
	 // String data=cl.getStringCellValue(); 
	 //  System.out.println(data);
	   }

}
