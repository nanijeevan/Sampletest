package datadrivenFrameWork;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDFrameworkTest2 {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
        File src=new File("D:\\testing\\testing1\\data.xlsx");
    
        FileInputStream fis=new FileInputStream(src);
    
        XSSFWorkbook wb=new XSSFWorkbook(fis);
    
        XSSFSheet sheet1=wb.getSheetAt(0);
        int rowcount=sheet1.getLastRowNum();
        System.out.println("Total Row " + rowcount);
        String cellValue = "";
        for(int i=0;i<=rowcount;i++) 
        {
        	int cellcount=sheet1.getRow(i).getLastCellNum();
        	//System.out.println("Total columns " + cellcount);
            
        	//Cell cell1 = sheet1.getRow(i).getCell(j); 
            Cell cell2 = sheet1.getRow(i).getCell(0);   
            Cell cell1 = sheet1.getRow(i).getCell(1); 
            switch (cell2.getCellType()) {
            
            case STRING:
                System.out.print(cell2.getRichStringCellValue().getString());
                System.out.println(cell1.getRichStringCellValue().getString());
                break;
                
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell2)) {
                    System.out.println(cell2.getDateCellValue());
                    System.out.println(cell1.getDateCellValue());
                } else {
                    System.out.println(cell2.getNumericCellValue());
                    System.out.println(cell1.getNumericCellValue());
               }
                break;
                
            case BOOLEAN:
                System.out.println(cell2.getBooleanCellValue());
                System.out.println(cell1.getBooleanCellValue());
                break;
            case BLANK:
            	 System.out.print(cell2.getRichStringCellValue().toString());
                 System.out.println(cell1.getRichStringCellValue().toString());
        		break;
            	
            case FORMULA:
                System.out.println(cell2.toString());
                System.out.println(cell1.getCellFormula());
                break;
           
           
            default:
            	
                System.out.println();
            }    
        
    } 
             wb.close();
    }

    }

