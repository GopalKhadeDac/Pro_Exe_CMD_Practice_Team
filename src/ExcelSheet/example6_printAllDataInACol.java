package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example6_printAllDataInACol 
  {
	
	 public static void main(String[] args) throws IOException 
		{
				
		   FileInputStream  file=new FileInputStream("C:\\Sandhya\\Study material\\Selenium\\3rd FebSelenium (version 1).xlsx");
	      
		   Sheet	sh=   WorkbookFactory.create(file).getSheet("Sheet2");
		   int  lastRowIndex = sh.getLastRowNum();

           for(int i=0;  i<=lastRowIndex;  i++)
          {
        	  String  value = sh.getRow(i).getCell(3).getStringCellValue();
              System.out.println(value);
          }
		}
}








