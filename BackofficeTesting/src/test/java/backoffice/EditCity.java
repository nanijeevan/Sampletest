package backoffice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditCity {
	
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
	Thread.sleep(3000);
	
	}
	@Test(priority=2)
	public void Editstate() throws Exception {
		driver.findElement(By.linkText("Primary data management")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'States, Cities')]")).click();
		Thread.sleep(2000);
		
		
	}
	
	
	

}
