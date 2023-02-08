package testing;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {


	WebDriver driver;
	
	@BeforeMethod
	public void browserlaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev-admin.elderlylife.co.uk/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@el.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")));
	}
	@Test
		public void test1()
		{
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
			List<WebElement> tag=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div[1]/div[2]/ul/li/ul/li/a"));
			
			for (int i=1;i<=5;i++)
			{
				
				String vari=Keys.chord(Keys.CONTROL,Keys.RETURN);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div[1]/div[2]/ul/li/ul/li["+i+"]/a")).sendKeys(vari);
				
				System.out.println(driver.getCurrentUrl());
			
			}
			
//			for(WebElement g1:tag)
//			{
//				g1.get
//				System.out.println(driver.getCurrentUrl());
//				
//			}
			
			
		}
		

	

}
