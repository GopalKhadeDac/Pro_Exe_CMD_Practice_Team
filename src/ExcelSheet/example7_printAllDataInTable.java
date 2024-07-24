package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example7_printAllDataInTable 
{
	 public static void main(String[] args) throws IOException 
		{
				
		   FileInputStream  file=new FileInputStream("C:\\Sandhya\\Study material\\Selenium\\3rd FebSelenium (version 1).xlsx");
	      
		   Sheet	sh=   WorkbookFactory.create(file).getSheet("Sheet2");
		   int  lastRowIndex = sh.getLastRowNum();    //      2
            //            0<=2
           for(int i=0;  i<=lastRowIndex;  i++)  //outer  for loop-->rows(0 to2)
           
           {                           
     	      int  lastCellIndex = sh.getRow(i).getLastCellNum()-1;
              
     	      for(int j=0; j<=lastCellIndex; j++)   //inner  for loop-->cols
     	      {    //
                 String  value=sh.getRow(i).getCell(j).getStringCellValue();
                 System.out.print(value+" ");
     	      
           }   
           System.out.println();

		}

		}
}
