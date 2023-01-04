package GenericLibraries;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	 /**
     * This is used for  read data from excel 
     * @param SheetName
     * @return
     * @throws Throwable
     */
    public  Object[][] readMultipleData(String SheetName) throws Throwable
    {
  	  FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
  	  Workbook wb = WorkbookFactory.create(fi);
  	  Sheet sh = wb.getSheet(SheetName);
  	  int lastROW = sh.getLastRowNum()+1;
  	  short lastCell = sh.getRow(0).getLastCellNum();
  	  
  	  Object[][] obj = new Object[lastROW][lastCell];
  	  for(int i=0;i<lastROW;i++)
  	  {
  		  for(int j=0;j<lastCell;j++)
  		  {
  			  obj[i][j]= sh.getRow(i).getCell(j).getStringCellValue();
  		  }
  	  }
  	  return obj;
    }
	
    /*
     * getdatafrom excel
     */
    
    public String readDataFromExcel(String SheetName, int RowNo, int ColumnNo  ) throws Throwable {
        FileInputStream fis = new FileInputStream(IPathConstants.ExcelPath);
    		Workbook wb = WorkbookFactory.create(fis);
    		 Sheet sh = wb.getSheet(SheetName);
    		Row ro = sh.getRow(RowNo);
    		Cell cel = ro.getCell(ColumnNo);
    		String value = cel.getStringCellValue();
    		return value;
    	
    	}
}
