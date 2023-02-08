package testing;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendertest1 {
	
	WebDriver driver;
	@Test
	public void setup() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://jqueryui.com/datepicker/");
		
		WebElement frame1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		Thread.sleep(2000);
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String date="22";
		String month="March";
		String year="2023";
		
		//month and year selection
		while(true)
		{
			String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			}
		}
		
		
		//Date selection
		
		
	List <WebElement> dates=	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	for(WebElement ele:dates)
	{
		String day=ele.getText();
		if(day.equalsIgnoreCase(date))
		{
			ele.click();
		}
		
		
	}
	
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	
	
	//scroll by element
	Thread.sleep(2000);
	//Locating element by link text and store in variable "Element"        		
    WebElement Element = driver.findElement(By.xpath("//a[contains(text(),'Twitter')]"));

    // Scrolling down the page till the element is found		
    js.executeScript("arguments[0].scrollIntoView();", Element);
    Thread.sleep(2000);
    WebElement Element1 = driver.findElement(By.xpath("//a[contains(text(),'Plugins')]"));

    // Scrolling down the page till the element is found		
    js.executeScript("arguments[0].scrollIntoView();", Element1);
    
    
  
	
	}


	
	
//	@AfterMethod
//	public void closebrowser()
//	{
//		driver.close();
//	}
	
	
	
}