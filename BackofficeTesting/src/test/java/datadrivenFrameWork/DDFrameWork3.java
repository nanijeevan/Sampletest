package datadrivenFrameWork;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDFrameWork3 {
	
	   public static void main(String[] args) throws Exception {
           File src=new File("C:\\Users\\Sagar\\Desktop\\TestInputData.xlsx");
       
           FileInputStream fis=new FileInputStream(src);
       
           XSSFWorkbook wb=new XSSFWorkbook(fis);
       
           XSSFSheet sheet1=wb.getSheetAt(0);
           int rowcount=sheet1.getLastRowNum();
           System.out.println("Total Row" + rowcount);
       
           for(int i=0;i<rowcount+1;i++) {
       
               System.out.println(i);
               //GET CELL
               Cell cell1 = sheet1.getRow(i).getCell(0);   
               //SET AS STRING TYPE
              // cell1.setCellType(Cell.CELL_TYPE_STRING);
               String data0= cell1.getStringCellValue();
               System.out.println("Test Data From Excel : "+data0);
           }
       
           wb.close();
         }

}
