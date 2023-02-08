package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTooltip {
static WebDriver driver;

	
	
	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
		//driver.get("https://dev-app.elderlylife.co.uk/");
		
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
//		driver.findElement(By.name("email")).sendKeys("gleecustest1@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("123456789");	
//		Thread.sleep(3000);		
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(5000);	
//			driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
//
//Thread.sleep(4000);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,100)");
		
		
		
	
				//WebElement e1=driver.findElement(By.xpath("//p[contains(text(),'Vouchers & Gift Cards2357')]"));
			WebElement e2=driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));	
					
					driver.switchTo().frame(e2);
					Thread.sleep(2000);
					
							WebElement e1=driver.findElement(By.xpath("//input[@id='age']"));
							Actions action=new Actions(driver);			
							action.moveToElement(e1).build().perform();		
							Thread.sleep(4000);	
			System.out.println(driver.findElement(By.xpath("//*[@id=\"age\"]")).getAttribute("title"));
		
			
		
			
			System.out.println(driver.findElements(By.tagName("iframe")).size());
			//int numberOfFrames = driver.findElements(By.tagName("iframe")).size();
			//System.out.println("no. of iframes are " + numberOfFrames);
			
		//	System.out.println(driver.getWindowHandles());
	
	}

}
