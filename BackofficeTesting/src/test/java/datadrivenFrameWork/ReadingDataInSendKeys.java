package datadrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingDataInSendKeys {
	
	WebDriver driver;
	@Test
	public void dataentry() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://dev-app.elderlylife.co.uk/");
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.name("email"));
		WebElement Password=driver.findElement(By.name("password"));
		FileInputStream str=new FileInputStream("D:\\testing\\testing1\\data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(str);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFCell cell = null;
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	
		  for(int i=1;i<=rowCount;i++) {
		  //Enter the values read from Excel in firstname,lastname,mobile,email,address
			  
			  
			  int cellcount=sheet.getRow(i).getLastCellNum();
			  
			  for(int j=0;j<cellcount;j++){
				  DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
					
			  email.sendKeys(sheet.getRow(i).getCell(j).getStringCellValue());
			//Password.sendKeys(sheet.getRow(i).getCell(j+1).getNumericCellValue());
			 
			  
			  
			 
			
			
			
			// Password.sendKeys(Password.sendKeys);
			
			Thread.sleep(2000);
			  driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
			
		  }
		  }
	}
	
	
	
	
	
  
}
