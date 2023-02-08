package backoffice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CreateClass {
	
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
		driver.findElement(By.linkText("Timetable Management")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Classes')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'+Create New Class')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("MockClass One");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='desc']")).sendKeys("MockClass One");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(text(),'Central Board of Secondary Education')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(text(),'Other State Boards')]")).click();
		Thread.sleep(2000);
		WebElement grade=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[4]/span[1]/select[1]"));
		Select select=new Select(grade);
		select.selectByIndex(1);
		Thread.sleep(2000);
		WebElement subject=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[4]/span[2]/select[1]"));
		Select select1=new Select(subject);
		select1.selectByIndex(1);
		Thread.sleep(2000);
		WebElement chapter=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[5]/span[1]/select[1]"));
		Select select2=new Select(chapter);
		select2.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(text(),'Hyperbolic Equations-1')]")).click();
		Thread.sleep(2000);
		WebElement duration=	driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[8]/span[1]/select[1]"));
		Select select3=new Select(duration);
		select3.selectByIndex(5);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[9]/input[1]")).sendKeys("https://zoom.us/j/96130841294?pwd=YXJUYXd5bjRnditMMmJOUFNwMzFjUT09");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[7]/input[1]")).sendKeys("01080020221000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Create Class')]")).click();
		Thread.sleep(7000);
		
		
		
	}
	
	@AfterTest
	public void terminate()
	{
		driver.close();
	}
	
	
	
}
