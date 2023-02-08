package datadrivenFrameWork;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDFrameWorkTest1 {
	
	public static void main(String[] args) throws Exception {
        File src=new File("D:\\testing\\testing1\\data.xlsx");
    
        FileInputStream fis=new FileInputStream(src);
    
        XSSFWorkbook wb=new XSSFWorkbook(fis);
    
        XSSFSheet sheet1=wb.getSheetAt(0);
        int rowcount=sheet1.getLastRowNum();
     
        System.out.println("Total Row " + rowcount);
    
        for(int i=0;i<rowcount+1;i++) 
        {
         int cellcount=sheet1.getRow(0).getLastCellNum();
       //  System.out.println("Total Column " + cellcount);
            for(int j=0;j<=cellcount;j++)
            {
            Cell cell1 = sheet1.getRow(i).getCell(0);   
          Cell row1=  sheet1.getRow(i).getCell(j+1);
            
            switch (cell1.getCellType()) {
            case STRING:
                System.out.println(cell1.getRichStringCellValue().getString());
                break;
                
                
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell1)) {
                    System.out.println(cell1.getDateCellValue());
                } else {
                    System.out.println(cell1.getNumericCellValue());
                }
                break;
                
            case BOOLEAN:
                System.out.println(cell1.getBooleanCellValue());
                
                
                break;
                
            case FORMULA:
                System.out.println(cell1.getCellFormula());
                
                break;
                
            default:
                System.out.println();
        }
            
          
        }
        }
        wb.close();
    
    
    }
    

}
