package ExcelSheet;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;


class example3_getColSizeInARow 
{
    public static void main(String[] args) throws IOException
    {
	
       FileInputStream  file=new FileInputStream("C:\\Sandhya\\Study material\\Selenium\\3rd FebSelenium (version 1).xlsx");
       int colSize=WorkbookFactory.create(file).getSheet("Sheet2").getRow(2).getLastCellNum();
       System.out.println(colSize);
    
    
    
    
    
    }






}
