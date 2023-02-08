package tableautomation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.List;

import org.apache.poi.hpsf.Date;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WritingtheDataIntoExcel {

//	public static void main(String[] args) {
//	      try (OutputStream os = new FileOutputStream("D:\\New folder\\Javatpoint.xlsx")) {  
//	          Workbook wb = new HSSFWorkbook();  
//	          Sheet sheet = wb.createSheet("Sheet");  
//	          Row row = sheet.createRow(2);                            
//	          row.createCell(0).setCellValue(1.1); // Float value  
//	          row.createCell(1).setCellValue(" "+new Date()); // Date type   
//	          row.createCell(2).setCellValue(" "+Calendar.getInstance());// Calendar  
//	          row.createCell(3).setCellValue("a string value"); // String  
//	          row.createCell(4).setCellValue(true); // Boolean  
//	          row.createCell(5).setCellType(CellType.ERROR); // Error  
//	          wb.write(os);  
//	          }catch(Exception e) {  
//	              System.out.println(e.getMessage());  
//	          } 
//
//}
	WebDriver driver;

	

	@Test
	public void test1() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bo-dev.nslsdev.com/");
		driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
		driver.findElement(By.id("password")).sendKeys("AdminOne@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/nav[2]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'States, Cities')]")).click();
		Thread.sleep(1000);
		String s1=driver.findElement(By.xpath("//div[@class='widget-createuser widget-p-sm']")).getText();
//		System.out.println(s1);

		//Printing the table data
		
		

		List<WebElement>  Wholecolumns=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[1]"));
		
		int clsize=Wholecolumns.size();
		System.out.println(clsize);
		
		//Printing Whole Column Data
		
	    OutputStream os = new FileOutputStream("D:\\New folder\\Javatpoint4.xlsx"); 
	          Workbook wb = new HSSFWorkbook();  
	          Sheet sheet = wb.createSheet("Sheet");  
	          Row row = sheet.createRow(0);  
	      
          
	       

			for(int i=1;i<=clsize;i++)
			{
			String s3=	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div["+i+"]/div[1]")).getText();
			
			System.out.print(s3+ " ");
			//System.out.println();
			row.createCell(i).setCellValue("1");
			   wb.write(os);
			row.createCell(i).setCellValue("4");
			   wb.write(os);
			row.createCell(i).setCellValue("8");
			   wb.write(os);
			row.createCell(i).setCellValue("7");
			   wb.write(os);
			row.createCell(i).setCellValue("25");
			row.createCell(i).setCellValue("785");
			row.createCell(i).setCellValue("3");
			row.createCell(i).setCellValue("45");
			
		     wb.write(os);
			
			}
	
			Thread.sleep(2000);
	}
	
	@AfterMethod
	public void terminate()
	{
		driver.close();
	}
	
}