package testing;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangetheDownloadPath {
	WebDriver driver;
	@Test
	public void login() throws Exception
	{	
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\BackofficeTesting\\Driver\\chromedriver.exe");
		 //driver=new ChromeDriver();
		 ChromeOptions options = new ChromeOptions();
		 Map<String, Object> prefs = new HashMap<String, Object>();
	  //   prefs.put("download.default_directory",System.getProperty("user.dir") + File.separator + "autodownload");
	     prefs.put("download.default_directory","D:\\testing\\testing1");
	     
	     
	     options.setExperimentalOption("prefs", prefs);
	                                                                                                                          
	     ChromeDriver driver= new ChromeDriver(options);
	     driver.get("https://file-examples.com/wp-content/uploads/2017/02/file_example_XLSX_1000.xlsx");
//		driver.get("https://bo-dev.nslsdev.com/");
//		driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
//		driver.findElement(By.id("password")).sendKeys("AdminOne@123");
//		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//
//	
//	driver.manage().window().maximize();
//	Thread.sleep(3000);
//	driver.findElement(By.linkText("Primary data management")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//a[contains(text(),'Chapters, Topics')]")).click();
//	Thread.sleep(2000);   
//	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[5]/div/a")).click();
	
	     
	     
	   Thread.sleep(4000);
	   driver.close();
	}

}
