package backoffice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateState {
	WebDriver driver;
	@BeforeMethod
	public void login() throws Exception
	{	
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\TOSHIBA\\eclipse-workspace\\BackofficeTesting\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://bo-dev.nslsdev.com/");
		driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
		driver.findElement(By.id("password")).sendKeys("AdminOne@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	String Pagetitle =	driver.getTitle();
	System.out.println(Pagetitle);
	Thread.sleep(3000);
	driver.findElement(By.linkText("Primary data management")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'States, Cities')]")).click();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	}
	@Test(priority=1)
	public void createstatemodalpage() throws Exception {
		
		
		Thread.sleep(3000);
		WebElement modalpage=	driver.findElement(By.xpath("//span[contains(text(),'+Create New State')]"));
		
		modalpage.click();
		System.out.println(modalpage.getText());
		driver.findElement(By.xpath("//h5[contains(text(),'Create State')]")).isDisplayed();
		Thread.sleep(2000);
		
	}
	@Test(priority=2)
	public void fieldsinmodalpage() throws Exception
	{
		driver.findElement(By.xpath("//span[contains(text(),'+Create New State')]")).click();
		WebElement statename=	driver.findElement(By.xpath("//small[contains(text(),'State Name')]"));
		System.out.println(	statename.getText());
		
		statename.isDisplayed();
		WebElement countryname= driver.findElement(By.xpath("//small[contains(text(),'Country')]"));
		System.out.println(countryname.getText());
		countryname.isDisplayed();
		WebElement createbutton=driver.findElement(By.xpath("//button[contains(text(),'Create')]"));
		System.out.println(createbutton.getText());
		createbutton.isDisplayed();
		WebElement closeicon=driver.findElement(By.xpath("//span[contains(text(),'×')]"));
		System.out.println(closeicon.getText());
		closeicon.isDisplayed();
		
		Thread.sleep(2000);
		
		
	}

	
	

	@Test(priority=3)
	public void closebuttonfunctionality() throws Exception 
	{
		driver.findElement(By.xpath("//span[contains(text(),'+Create New State')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
		Thread.sleep(2000);
	}
	@Test(priority=4)
	public void functionalityofsubmitbutton() throws Exception 
	{
		driver.findElement(By.xpath("//span[contains(text(),'+Create New State')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		Thread.sleep(1000);
		String t1=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/p[1]")).getText();
		System.out.println(t1);
		String t2=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/p[2]")).getText();
		System.out.println(t2);
		
		Thread.sleep(2000);
	
	}
	
	@Test(priority=5)
	public void functionalityofsubmitbuttonwithoutcountry() throws Exception 
	{
		driver.findElement(By.xpath("//span[contains(text(),'+Create New State')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Ladakh");
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		Thread.sleep(1000);
		
		String t2=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/p[2]")).getText();
		System.out.println(t2);
		
		Thread.sleep(2000);
	
	}
	@Test(priority=6)
	public void functionalityofsubmitbuttonwithoutstate() throws Throwable 
	{
		driver.findElement(By.xpath("//span[contains(text(),'+Create New State')]")).click();
		Thread.sleep(1000);
		
		
		WebElement scountry=driver.findElement(By.xpath("//select[@id='select']"));
		Select select=new Select(scountry);
		select.selectByIndex(1);
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		Thread.sleep(1000);
		
		String t1=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/p[1]")).getText();
		System.out.println(t1);
		
		Thread.sleep(2000);
	
	}
	
	@Test(priority=7)
	public void functionalityofscroller() throws Throwable 
	{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[8]/div[1]"));

        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
	}
	@Test(priority=8)
	public void createstate() throws Throwable 
	{
		driver.findElement(By.xpath("//span[contains(text(),'+Create New State')]")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Jammu&Kashmir");
		Thread.sleep(1000);
		WebElement scountry=driver.findElement(By.xpath("//select[@id='select']"));
		Select select=new Select(scountry);
		select.selectByIndex(1);
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		Thread.sleep(3000);
    
	}
	
	@Test(priority=9)
	public void createDuplicatedstate() throws Throwable 
	{
		driver.findElement(By.xpath("//span[contains(text(),'+Create New State')]")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Jammu&Kashmir");
		Thread.sleep(1000);
		WebElement scountry=driver.findElement(By.xpath("//select[@id='select']"));
		Select select=new Select(scountry);
		select.selectByIndex(1);
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		Thread.sleep(3000);
    //  String s=  driver.findElement(By.xpath("//div[contains(text(),'name is already taken. Please use another name')]")).getText();
      WebElement s=  driver.findElement(By.xpath("//div[contains(text(),'name is already taken. Please use another name')]"));
      s.isDisplayed();
      //System.out.println(s);
	}
	
	
	@AfterMethod
	public void terminate()
	{
		driver.close();
	}

}
