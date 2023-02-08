package tableautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableClassAutomation {
	WebDriver driver;
	@BeforeTest
	public void browserlaunch() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	
		Thread.sleep(3000);
	
	}
	
	@Test
	public void table() throws Exception
	{
		//Printing the table data
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"));
		int rwsize=rows.size();
		System.out.println(rwsize);
		
		List<WebElement>  columns=driver.findElements(By.xpath("//table[@id=\"customers\"]//th"));
		
		int clsize=columns.size();
		System.out.println(clsize);
		
		//String state="telangana";
		// Print the table data
		for(int i=2;i<=rwsize;i++)
		{
			for(int j=1;j<=clsize;j++)
			{
			String s3=	driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+i+"]//td["+j+"]")).getText();
			
			System.out.print(s3+ " ");
		
			
			}
			System.out.println();
			
		
		}
	
	}
}
