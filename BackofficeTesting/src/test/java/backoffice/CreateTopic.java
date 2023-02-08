package backoffice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CreateTopic {
	
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
		driver.findElement(By.xpath("//a[contains(text(),'Chapters, Topics')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'+Create New Topic')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Hyperbolic Equations-1");
		Thread.sleep(2000);
	WebElement Grade=	driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[2]/span[1]/select[1]"));
	Select select=new Select(Grade);
	select.selectByIndex(1);
	Thread.sleep(2000);
	WebElement subject=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[3]/span[1]/select[1]"));
	Select select1=new Select(subject);	
	select1.selectByIndex(1);
	Thread.sleep(2000);
	WebElement chapter=	driver.findElement(By.xpath("//select[@id='chapter']"));
	Select select2=new Select(chapter);
	select2.selectByIndex(1);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@id='exampleText']")).sendKeys("Topic of Hyperbolic Equations-1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
	Thread.sleep(7000);
	}

	@AfterTest
	public void terminate()
	{
		driver.close();
	}
	
	
}
