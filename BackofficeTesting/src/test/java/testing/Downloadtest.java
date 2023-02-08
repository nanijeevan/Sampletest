package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Downloadtest {
	WebDriver driver;
	@Test(priority=1)
	public void login() throws Exception
	{	
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://bo-dev.nslsdev.com/");
		driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
		driver.findElement(By.id("password")).sendKeys("AdminOne@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	String Pagetitle =	driver.getTitle();
	System.out.println(Pagetitle);
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Primary data management")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("//span[contains(text(),'+Create New Chapter')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/a[1]/*[1]")).click();
	Thread.sleep(2000);
	
	}
}
