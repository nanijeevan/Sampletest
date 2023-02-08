package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VigeoDash {
	WebDriver driver;
	
	
	@Test
	public void test1() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://dev.vigeodash.com/login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@gleecus.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vigeo@1234");
		Thread.sleep(2000);
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/button[1]/div[1]")).click();
		Thread.sleep(3000);
		driver.navigate().to("https://dev.vigeodash.com/claim-details");
		//driver.navigate.to("https://dev.vigeodash.com/claim-details");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
	
		
		
	}

}
