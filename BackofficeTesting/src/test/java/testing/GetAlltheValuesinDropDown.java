package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAlltheValuesinDropDown {
	
	WebDriver driver;
@Test
	public void Launch() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bo-dev.nslsdev.com/");
		driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
		driver.findElement(By.id("password")).sendKeys("AdminOne@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/nav[2]/ul[1]/li[2]/a[1]")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/nav[2]/ul/li[2]/div/ul/li[1]/a")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'+Create New State')]")).click();
		Thread.sleep(2000);
		
		
		  Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"select\"]")));

		    //Get all options
		    List<WebElement> dd = dropdown.getOptions();

		    //Get the length
		    System.out.println(dd.size());

		    // Loop to print one by one
		    for (int j = 0; j < dd.size(); j++) {
		        System.out.println(dd.get(j).getText());
		        dropdown.selectByIndex(j);
		        Thread.sleep(2000);
		    }
				
	}
	
}