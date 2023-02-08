package backoffice_Edit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditState {

	
	WebDriver driver;
	@Test(priority=1)
	public void login() throws Exception
	{	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
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
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[1]/span[1]/*[1]")).click();
		Thread.sleep(2000);
		//UpdateStateName
		driver.findElement(By.xpath("//input[@id='stateName']")).clear();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='stateName']")).sendKeys("Kerala");
	    Thread.sleep(2000);
	    //Click on Update button
		driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
		Thread.sleep(7000);
		
		
		
		
	}
	
	@AfterTest
	public void terminate()
	{
		driver.close();
	}

}
