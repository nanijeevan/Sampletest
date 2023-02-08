package backoffice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateSchool {
	
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
	
	public void School()
	{
		driver.findElement(By.linkText("User management")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Schools')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/button[1]")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Sri Chaitainya High School");
	WebElement country=	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/select[1]"));
		Select select=new Select(country);
		select.selectByIndex(1);
		WebElement state=	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[1]/div[2]/span[1]/select[1]"));
		Select select1=new Select(state);
		select1.selectByIndex(5);
		WebElement city=	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[2]/div[2]/span[1]/select[1]"));
		Select select2=new Select(city);
		select2.selectByIndex(1);
	WebElement board=	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[1]/div[3]/span[1]/select[1]"));
	Select select3=new Select(board);
	select3.selectByIndex(1);
	driver.findElement(By.xpath("//button[contains(text(),'Save details')]")).click();
	}

}
