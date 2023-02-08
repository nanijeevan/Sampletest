package tableautomation;

import java.io.File;
import java.io.PrintStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintWholeSelectedColumn {
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
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/nav[2]/ul[1]/li[2]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(text(),'States, Cities')]")).click();
	Thread.sleep(1000);
	String s1=driver.findElement(By.xpath("//div[@class='widget-createuser widget-p-sm']")).getText();
//	System.out.println(s1);

	//Printing the table data
	
	

	List<WebElement>  Wholecolumns=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[1]"));
	
	int clsize=Wholecolumns.size();
	System.out.println(clsize);
	
	//Printing Whole Column Data
	String s4 = "uttarpradesh";
		for(int i=1;i<=clsize;i++)
		{
	String	s3=	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div["+i+"]/div[1]")).getText();
		
		System.out.print(s3+ " ");
		System.out.println();
		
	
		}

//System.out.println(s3);

	}
	
	@AfterMethod
	public void terminate()
	{
		driver.close();
	}
}
