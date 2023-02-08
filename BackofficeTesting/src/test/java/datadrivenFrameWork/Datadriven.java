package datadrivenFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datadriven {
	WebDriver driver;
    WebDriverWait wait;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    XSSFCell cell;
	public static void main(String[] args) throws Exception {
		
	    // Import excel sheet.
	     File src=new File("C:\\Users\\TOSHIBA\\eclipse-workspace\\BackofficeTesting\\src\\data1.xlsx");
	      
	     // Load the file.
	     FileInputStream finput = new FileInputStream(src);
	      
	     // Load he workbook.
	    workbook = new XSSFWorkbook(finput);
	      
	     // Load the sheet in which data is stored.
	     
	     workbook.getSheetAt(0);
	     sheet= workbook.getSheetAt(0);
	     sheet.getRow(0).getCell(0).getStringCellValue();
	     
		

	}

}
