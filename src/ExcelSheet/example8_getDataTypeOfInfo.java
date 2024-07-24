package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example8_getDataTypeOfInfo 
{

	 public static void main(String[] args) throws IOException 
		{
				
		   FileInputStream  file=new FileInputStream("C:\\Sandhya\\Study material\\Selenium\\3rd FebSelenium (version 1).xlsx");
	      
		   Sheet  sh = WorkbookFactory.create(file).getSheet("Sheet3");
		  
	       Cell cellinfo= sh.getRow(2).getCell(0);
		   CellType  s1=cellinfo.getCellType();
		   System.out.println(s1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}












}
