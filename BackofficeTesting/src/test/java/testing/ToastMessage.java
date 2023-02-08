package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToastMessage {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev-admin.elderlylife.co.uk/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@el.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		Thread.sleep(4000);
	
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
	
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Add New')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("demotest99225");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[contains(text(),'Outgoings')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
//	Thread.sleep(2000);
		  //String loginStatus = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[1]"))).getText();
		  String loginStatus = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Catgeory was updated successfully.')]"))).getText();
		 // String loginStatus = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Catgeory was updated successfully.')]"))).getText();
	System.out.println(loginStatus);
	}

}
