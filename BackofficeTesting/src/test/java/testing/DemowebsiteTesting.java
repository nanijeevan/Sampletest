package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemowebsiteTesting {
	
	WebDriver driver;
	@BeforeMethod
	public void test1() throws Exception
	{

	
	
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://udyamregistration.gov.in/searchregistration.aspx");
WebElement radiobutton= 	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rblType_0']"));
WebElement state= 	driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlPState"));
WebElement District= 	driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlPDistrict"));
//WebElement Search= driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtsearchNic"));

//WebElement Searchbutton= driver.findElement(By.name("ctl00$ContentPlaceHolder1$btnSearch"));
Thread.sleep(2000);
radiobutton.isSelected();
Select selectstate =new Select(state);

selectstate.selectByValue("36");
Thread.sleep(2000);
driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtsearchNic")).sendKeys("cement");

driver.findElement(By.name("ctl00$ContentPlaceHolder1$btnSearch")).click();

	
	}
	
	
	@Test
	public void test2() throws Exception
	{
		Thread.sleep(20000);
		driver.findElement(By.className("table table-bordered table-hover table-striped"));
		
		String table=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UpdatePaneldd1\"]/div[4]/div/div/table")).getText();
		System.out.println(table);
		
	}

}
