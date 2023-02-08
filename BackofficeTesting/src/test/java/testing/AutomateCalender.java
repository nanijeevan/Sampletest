package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateCalender {
	WebDriver driver;
	
	

	@BeforeMethod
	public void setup() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Documents\\Bandicam\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			
		driver.get("https://dev-app.elderlylife.co.uk/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("gleecustest1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456789");	
		Thread.sleep(3000);		
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);	
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div[1]/div/div/div[1]")).click();

	Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Outgoings')]")).click();		
	}

	
	
	
	
	
	@Test
	public void test1() throws Exception
	{
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'+ Add New Outgoings')]")).click();
		Thread.sleep(2000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;  
		  js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		String s= driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[2]/div[2]/div[2]/div[1]/div/input")).getText();
		  System.out.println(s);
//		    String date="2009-02-09";
//		    js.executeScript("document.getElementByXpath('//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]').value ='"+date.toString()+"'",2000);
//		
	}

}
