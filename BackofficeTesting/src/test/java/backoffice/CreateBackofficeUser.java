package backoffice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CreateBackofficeUser {
	
	WebDriver driver;
	@Test(priority=1)
	public void login() throws Exception
	{	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TOSHIBA\\eclipse-workspace\\BackofficeTesting\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://bo-dev.nslsdev.com/");
		driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
		driver.findElement(By.id("password")).sendKeys("AdminOne@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	String Pagetitle =	driver.getTitle();
	System.out.println(Pagetitle);
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	}
	
	@Test(priority=2)
	public void School() throws Exception
	{
		driver.findElement(By.linkText("User management")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Backoffice Users')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sundhar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("krishna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sundhar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("9848013345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='confPassword']")).sendKeys("12345678");
		Thread.sleep(2000);
		WebElement role=driver.findElement(By.xpath("//select[@id='select']"));
		Select select=new Select(role);
		select.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Save details')]")).click();
		Thread.sleep(7000);
	}
	@AfterTest
	public void terminate()
	{
		driver.close();
	}

}
