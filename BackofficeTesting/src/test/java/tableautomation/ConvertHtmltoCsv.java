package tableautomation;

import java.io.FileWriter;
import java.util.List;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;

import org.apache.poi.xwpf.usermodel.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.jsoup.Jsoup;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ConvertHtmltoCsv {
	public class TableAutomatio3 {
		WebDriver driver;
		@BeforeTest
		public void browserlaunch() throws Exception
		{
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--headless");
			driver=new ChromeDriver(option);
			
			driver.manage().window().maximize();
			driver.get("https://bo-dev.nslsdev.com/");
			driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
			driver.findElement(By.id("password")).sendKeys("AdminOne@123");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(3000);
		
		}
		
		@Test
		public void table() throws Exception
		{
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/nav[2]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'States, Cities')]")).click();
		Thread.sleep(1000);
		String s1=driver.findElement(By.xpath("//div[@class='widget-createuser widget-p-sm']")).getText();
//		System.out.println(s1);

		//Printing the table data
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div"));
		int rwsize=rows.size();
		System.out.println(rwsize);

		List<WebElement>  columns=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div"));
		
		int clsize=columns.size();
		System.out.println(clsize);
		
		//String state="telangana";
		// Print the table data
		String s3=null;
		for(int i=1;i<=rwsize;i++)
		{
			for(int j=1;j<=clsize;j++)
			{
			 s3=	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div["+i+"]/div["+j+"]")).getText();
			
			System.out.print(s3+ " ");
		
		
			}
			System.out.println();
//			Assert.assertEquals("Telangana", s3);
		
		}
	

		}
	
	}
	}
