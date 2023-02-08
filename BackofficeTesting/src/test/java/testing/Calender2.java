package testing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//       // System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://dev-app.elderlylife.co.uk/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("gleecustest1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456789");	
		Thread.sleep(3000);		
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);	
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div[1]/div/div/div[1]")).click();

	Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Outgoings')]")).click();	
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'+ Add New Outgoings')]")).click();
		Thread.sleep(2000);
		
//-----------------------------------------------------------------------------------------------------------------


		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Accessories')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Keyboard')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("testing");
		Thread.sleep(1000);
	 JavascriptExecutor js = (JavascriptExecutor) driver;  
		  js.executeScript("window.scrollBy(0,100)");
		  Thread.sleep(1000);

		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Others')]")).click();
		Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,700)");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='formBasicEmail']")).sendKeys("200");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Monthly')]")).click();

	 js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
	
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      //  LocalDate localDate = LocalDate.now();
        LocalDate date = LocalDate.of(2023, 5, 13);
        System.out.println(date);
        driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys(dtf.format(date));
        //driver.quit();
        Thread.sleep(1000);
        LocalDate date1 = LocalDate.of(2023, 6, 13);
        System.out.println(date);
        driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/div[1]/input[1]")).sendKeys(dtf.format(date1));
        //driver.quit();
        Thread.sleep(1000);
        
      
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(1000);
    	driver.findElement(By.xpath("//button[contains(text(),'Add Outgoing')]")).click();
    }


	}


