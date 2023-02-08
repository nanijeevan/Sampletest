package datadrivenFrameWork;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class WorkingCodeSendkeys {
	WebDriver driver;
	@Test
	public void dataread() throws Exception
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
	
	//working code	
		
		//  email.sendKeys(sheet.getRow(i).getCell(j).getStringCellValue());
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		 for(int i=1;i<=rowCount;i++){
        
        //get cell count in a row
        int cellcount=sheet.getRow(i).getLastCellNum();		
		for(int j=0;j<cellcount;j++){
		sheet.getRow(i).getCell(j).getRichStringCellValue().getString();
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(j);
		//System.out.print(sheet.getRow(i).getCell(j));
		//email.sendKeys(sheet.getRow(i).getCell(j).getStringCellValue());
		System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
	    //Password.sendKeys(sheet.getRow(i).getCell(j+1).getStringCellValue());
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[2]/div/div/div/form/div[3]/button")).click();

	}
		 System.out.println();
		 }	
	
	}

}
