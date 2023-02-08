package tableautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableAutomatio3 {
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
	
	List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div"));
	int rwsize=rows.size();
	System.out.println(rwsize);

	List<WebElement>  columns=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div"));
	
	int clsize=columns.size();
	System.out.println(clsize);
	
	//String state="telangana";
	// Print the table data
	for(int i=1;i<=rwsize;i++)
	{
		for(int j=1;j<=clsize;j++)
		{
		String s3=	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div["+i+"]/div["+j+"]")).getText();
		
		System.out.print(s3+ " ");
	
		
		}
		System.out.println();
		
	
	}



Thread.sleep(2000);
////Page2
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[2]/div[3]/span[1]")).click();
List<WebElement> rows2=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div"));
int rwsize2=rows2.size();
System.out.println(rwsize2);

List<WebElement>  columns2=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div"));

int clsize2=columns2.size();
System.out.println(clsize2);





for(int i=1;i<=rwsize2;i++)
{
	for(int j=1;j<=clsize2;j++)
	{
	String s3=	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div["+i+"]/div["+j+"]")).getText();
	
	System.out.print(s3+ " ");

	
	}
	System.out.println();
	

}
	}


}
