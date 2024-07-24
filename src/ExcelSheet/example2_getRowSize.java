package ExcelSheet;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example2_getRowSize 
{
    public static void main(String[] args) throws EncryptedDocumentException, IOException 
    {
		FileInputStream  file=new  FileInputStream("C:\\Sandhya\\Study material\\Selenium\\3rd FebSelenium (version 1).xlsx");
        int  rowSize=  WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum()+1;
    
         System.out.println(rowSize);
    }









}
