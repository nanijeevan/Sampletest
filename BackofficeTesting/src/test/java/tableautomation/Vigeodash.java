package tableautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Vigeodash {
	
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void Browserlaunch() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://dev.vigeodash.com/login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@gleecus.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vigeo@1234");
		Thread.sleep(2000);
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/button[1]/div[1]")).click();
		Thread.sleep(3000);
		
	}
	
	@Test
	public void test1() throws Exception
	{
//		driver.navigate().to("https://dev.vigeodash.com/settings");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Primary details')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@id='claims-tab-tab-clinicianNames']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"cell-Action-173\"]/div/button[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")).click();
//		Thread.sleep(2000);
//		
//		//Approach-1
//
//		Actions action = new Actions(driver);
//		Actions keyDown = new Actions(driver); 
//		keyDown.sendKeys(Keys.chord(Keys.UP, Keys.ENTER)).build().perform();
//		
//		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
		
		//Approach-2
		
		//driver.findElement(By.xpath("//div[@class=\"react-select__option react-select__option--is-focused react-select__option--is-selected css-mz0a9y-option\"]")).click();
		//*[ @class='react-select__single-value css-1dimb5e-singleValue' and contains(text(),'TRUE')]
		driver.findElement(By.xpath("//button[contains(text(),'Admin')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Billing')]")).click();
		Thread.sleep(2000);
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(4000);
		
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]/button[1]/div[1]/div[10]/div[1]")).click();
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//button[@id='claims-tab-tab-related-claims']")).click();
		Thread.sleep(5000);
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Add a new update')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div[1]/div/div/div[1]/div")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[contains(text(),'Code Denial')]")).click();
//		Thread.sleep(3000);

		
	String str=	driver.findElement(By.xpath("//*[@class=\" css-1nmdiq5-menu\"]")).getText();	
	driver.findElement(By.xpath("//*[contains(text(),'Error') and @aria-disabled=\"false\"]")).click();
	//String str=	driver.findElement(By.className("css-10wo9uf-option	")).getText();
	
	System.out.println(str);

	
	
	
	
	///For Loop 
	List<WebElement> e1=driver.findElements(By.xpath("//*[@class=\" css-1nmdiq5-menu\"]"));
	for(int i=1;i<=5;i++)
	{
		driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div[1]/div/div/div[1]/div")).click();
	for(WebElement r1:e1 )
	{
		String stri=r1.getText();
		System.out.println(stri);
	}
	driver.findElement(By.xpath("//*[contains(text') and @aria-disabled=\"false\"]")).click();
	}	
	
	
	
	
	

	
}
}
