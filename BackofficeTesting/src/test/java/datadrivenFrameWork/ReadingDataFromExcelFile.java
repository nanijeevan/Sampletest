package datadrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingDataFromExcelFile {
	
	@Test
	public void dataread() throws Exception
	{
		FileInputStream str=new FileInputStream("D:\\testing\\testing1\\data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(str);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		
	
//		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
//		//int cellcount=sheet.getRow(1).getLastCellNum();
//		
//		 for(int i=1;i<=rowCount;i++){
//	            
//	            //get cell count in a row
//	            int cellcount=sheet.getRow(i).getLastCellNum();
//	            
//	            //iterate over each cell to print its value
//	            //System.out.println("Row"+ i+" data is :");
//	            Cell cell1 = sheet.getRow(i).getCell(0); 
//	            for(int j=0;j<cellcount;j++){
//	            	
//	               System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +" ");
//	                
//	            }
//	            System.out.println();
//	        }
		
		
	//working code	
		
		
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		 for(int i=0;i<=rowCount;i++){
        
        //get cell count in a row
        int cellcount=sheet.getRow(i).getLastCellNum();
		
		 for(int j=0;j<cellcount;j++){
		sheet.getRow(i).getCell(j).getRichStringCellValue().getString();
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(j);
		System.out.print(sheet.getRow(i).getCell(j));

		
	}
		 System.out.println();
		 }	
	
	}

}