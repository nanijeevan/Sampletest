package backofficemodulewise;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateBackOfficeUser {
WebDriver driver;
	WebElement ele1;
	
	
	@Test(dataProvider="create")
	public void login(String Email,String password) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\BackofficeTesting\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//SoftAssert sassert=new SoftAssert();
		driver.get("https://bo-dev.nslsdev.com/login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(4000);
		
		WebElement ele1=	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/nav[2]/ul[1]/li[1]/a[1]"));
		if(ele1.isDisplayed())
		{
			System.out.println("login successful");
		}
		else {
			System.out.println("login failed");
		}
		
		
	}
	
	@AfterMethod
	public void terminate()
	{
		driver.close();
	}
	

	@DataProvider(name="create")
	public Object[][] dataSet()
	{
		return new Object[][]
				{
				{"admin2@gleecus.com", "AdminTwo@123"},
				{"nanijeevangoud686@gmail.com", "Jeeva"},
				{"nanijeevand68699@gmail.com", "Jeeva"},
				{"nanijegoud689996@gmail.com", "Jeeva"},
				{"nanijegoud689996@gmail.com", ""},
				{"", "Jeeva"},
				{"",""},
				
			
				};
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
