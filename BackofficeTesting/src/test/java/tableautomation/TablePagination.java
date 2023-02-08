package tableautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TablePagination {
	WebDriver driver;
	@BeforeTest
	public void browserlaunch() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
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
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/nav[2]/ul[1]/li[3]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(text(),'Partnered Schools')]")).click();
	Thread.sleep(1000);
///	String s1=driver.findElement(By.xpath("//div[@class='widget-createuser widget-p-sm']")).getText();
	
	//converting String to Integer
	String s4=driver.findElement(By.xpath("//*[@class=\"ag-paging-number\" and @ref=\"lbTotal\"]")).getText();
	System.out.println(s4);
	int k=Integer.parseInt(s4);  
	//Printing value of i  
	System.out.println("Pagination size is "+k); 
	
	for(int h=1;h<=k;h++)
	{
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div"));
		int rwsize=rows.size();
		System.out.println(rwsize);

		List<WebElement>  columns=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div"));
		
		int clsize=columns.size();
		System.out.println(clsize);
		
		
		
	for(int i=1;i<=rwsize;i++)
	{
		for(int j=1;j<=clsize;j++)
		{
		String s3=	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div["+i+"]/div["+j+"]")).getText();
		
		System.out.print(s3+ " ");
	
		
		}
		System.out.println();
	}
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[2]/div[3]/span[1]")).click();
	
	}
	
	
	
}
	
	
	
}