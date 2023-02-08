package backoffice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
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
	Thread.sleep(3000);
	
	}
	@Test(priority=2)
	public void CreateUSER() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/nav[2]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/nav[2]/ul/li[3]/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/section/div/div/div[1]/div/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("varun");
		driver.findElement(By.id("lastName")).sendKeys("kumar");
		driver.findElement(By.id("email")).sendKeys("varun@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.id("confPassword")).sendKeys("12345678");
		WebElement drop=driver.findElement(By.id("select"));
		Select sel=new Select(drop);
		sel.selectByIndex(1);
		driver.findElement(By.xpath("//button[@type=\"sssubmit\"]")).click();
		
				
	}


}
