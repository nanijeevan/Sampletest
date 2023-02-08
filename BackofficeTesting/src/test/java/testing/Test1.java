package testing;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	WebDriver driver;
	@Test
	public void browserlaunch() throws Exception
	{
	       WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
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

		
			//driver.findElement(By.xpath("//span[contains(text(),'Outgoings')]")).click();				
//		   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));		
//	   		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'+ Add New Outgoings')]")));
//	   		driver.findElement(By.xpath("//button[contains(text(),'+ Add New Outgoings')]")).click();
		
			List<WebElement> tag=driver.findElements(By.tagName("a"));
			for(WebElement ar:tag)
			{
				String a=ar.getText();
				System.out.println(a);
			}
				
	}

}
