package backofficemodulewise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loinerrormessage {
	
	WebDriver driver;
	WebElement ele1;
	@Test
	public void login() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\BackofficeTesting\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://bo-dev.nslsdev.com/login");
		
		
		Thread.sleep(4000);

		WebElement Firstname = driver.findElement(By.xpath("//input[@id='email']"));
	
	
		Firstname.sendKeys("admin1@gleecus.com");
	
//	String expected = "Please include an '@' in the email address. 'jeevan' is missing an '@'."; 
	//System.out.println(actual.equals(expected));
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("AdminOne@123");
	WebElement login=	driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
	login.click();
JavascriptExecutor js = (JavascriptExecutor) driver;
	
	String actual = (String)js.executeScript("return arguments[0].validationMessage;", login); 
	System.out.println(actual);
	System.out.println(login.getText());
}
}
