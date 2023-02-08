package backoffice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CreateEducationBoard {
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
	public void createstate() throws Exception {
		driver.findElement(By.linkText("Primary data management")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Boards')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'+Create New Board')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Board of Secondary Education Kerala");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='shortname']")).sendKeys("SSC KL");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(text(),'Kerala')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='exampleText']")).sendKeys("This is the Board that supports Kerala State");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
	}
//	@AfterTest
//	public void terminate()
//	{
//		driver.close();
//	}
}
