package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {
	WebDriver driver;
	
	
	@Test
	public void test() throws Exception
	{
		WebDriverManager.chromedriver().setup();		
		driver =new ChromeDriver();
		driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[1]")));
		driver.findElement(By.xpath("/html/body/p[3]/span/a")).click();
		
	}

}
