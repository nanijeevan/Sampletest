package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableAutomation {
	
	
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
	
	String state="telangana";
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
	
	
	//Searching the data inside the table and printing the respective column data
	//	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/span/span")).click();
//	driver.findElement(By.xpath("//input[@id='ag-33-input']")).sendKeys("telangana");
//	Thread.sleep(2000);
//      
//	if(driver.findElement(By.xpath("//div[contains(text(),'Telangana')]")).isDisplayed())
//	{
//		System.out.println("telangana state found in the state list");
//		String r1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div")).getText();
//		System.out.println(r1);
//	}
//	else
//	{
//		System.out.println("telangana state found in the state list");
//	}
	
	
//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[3]/div/div/div/div/div[1]")).click();
//
//Thread.sleep(3000);
//String n1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/main[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div")).getText();
//System.out.println(n1);


//Table scrolling


JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,700)");

WebElement e1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[11]"));
//js.executeScript("arguments[0].scrollIntoView(true);", e1);






//driver.findElement(By.xpath("//*[contains(text(),'Blank')]")).click();


	
//	WebElement searchTextBox= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[3]"));
//	// retrieving html attribute value using getAttribute() method
//	String typeValue=searchTextBox.getAttribute("class");
//	System.out.println("Value of type attribute: "+typeValue);
//	
//WebElement element = driver.findElement(By.id("id_of_element"));
//js.executeScript("arguments[0].scrollIntoView(true)", element);
//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//Thread.sleep(500);




//Scroll bar 

	//Actions action =new Actions(driver);
	//action.moveToElement(e1).perform();
	//driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[12]/div[1]/div[1]/span[1]/*[1]")).click();
//	WebElement e2=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/span[1]"));
//	action.moveToElement(e2).perform();
	
					

driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[2]/div[3]/span[1]")).click();

	
	}
	
//
//	@AfterTest
//	public void closebrowser()
//	{
//		driver.close();
//	}
}
