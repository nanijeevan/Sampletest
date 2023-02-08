package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNotifications {
	
	WebDriver driver;
	@Test
	public void notifications()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		
			
		
		driver.manage().window().maximize();
		//driver.get("https://www.irctc.co.in/nget/train-search");
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		//Thread.sleep(2000);
	}

}
