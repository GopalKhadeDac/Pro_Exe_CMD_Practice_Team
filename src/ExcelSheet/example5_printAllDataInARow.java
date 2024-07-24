package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example5_printAllDataInARow 
{
	
   public static void main(String[] args) throws IOException 
	{
			
	 FileInputStream  file=new FileInputStream("C:\\Sandhya\\Study material\\Selenium\\3rd FebSelenium (version 1).xlsx");
	 
	 Sheet sh= WorkbookFactory.create(file).getSheet("Sheet2");
	 int lastCellIndex = sh.getRow(0).getLastCellNum()-1;
	  
     for(int i=0; i<=lastCellIndex;i++)
	 {  
        String   value= sh.getRow(0).getCell(i).getStringCellValue();
	    System.out.print(value+"  ");
	 }

	}
}




	


