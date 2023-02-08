package backoffice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateCity {
	
	WebDriver driver;
	@BeforeMethod
	public void login() throws Exception
	{	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TOSHIBA\\eclipse-workspace\\BackofficeTesting\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://bo-dev.nslsdev.com/");
		driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
		driver.findElement(By.id("password")).sendKeys("AdminOne@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	String Pagetitle =	driver.getTitle();
	System.out.println(Pagetitle);
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Primary data management")).click();
	driver.findElement(By.xpath("//a[contains(text(),'States, Cities')]")).click();
	
	}
	
	
	
	
	
	
	
	@Test(priority=2)
	public void createcitymodalpage() throws Exception 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'+Create New City')]")).click();
		WebElement modalpage=driver.findElement(By.xpath("//h5[contains(text(),'Create City')]"));
		modalpage.isDisplayed();
		String s1=modalpage.getText();
		System.out.println(s1);
		

	}
	@Test(priority=3)
	public void cityemodalpagefields() throws Exception 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'+Create New City')]")).click();
		WebElement cityname=	driver.findElement(By.xpath("//small[contains(text(),'City Name')]"));
		cityname.isDisplayed();
		String s2=cityname.getText();
		System.out.println(s2);
		WebElement countryname=	driver.findElement(By.xpath("//small[contains(text(),'Country')]"));
		countryname.isDisplayed();
		String s3=countryname.getText();
		System.out.println(s3);
		WebElement statename=		driver.findElement(By.xpath("//small[contains(text(),'State')]"));
		statename.isDisplayed();
		String s4=statename.getText();
		System.out.println(s4);
		WebElement createbutton=		driver.findElement(By.xpath("//button[contains(text(),'Create')]"));
		createbutton.isDisplayed();
		String s5=createbutton.getText();
		System.out.println(s5);
		WebElement closeicon=		driver.findElement(By.xpath("//span[contains(text(),'×')]"));
		closeicon.isDisplayed();
		String s6=closeicon.getText();
		System.out.println(s6);
		Thread.sleep(1000);

	}
	@Test(priority=4)
	public void functionalityofcloseicon() throws Exception 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'+Create New City')]")).click();
		
		WebElement closeicon=		driver.findElement(By.xpath("//span[contains(text(),'×')]"));
		
		closeicon.click();
		driver.findElement(By.xpath("//div[contains(text(),'Cities')]")).isDisplayed();
	}
	
	@Test(priority=5)
	public void createcity() throws Exception 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'+Create New City')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("shadnagar");
		Thread.sleep(1000);
		WebElement country=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[2]/span[1]/select[1]"));
		Select Cselect=new Select(country);
		Cselect.selectByIndex(1);
		Thread.sleep(1000);
		WebElement state=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[3]/span[1]/select[1]"));
		Select sselect=new Select(state);
		sselect.selectByIndex(1);
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		Thread.sleep(1000);
		
	}
	@Test(priority=6)
	public void createduplicatecity() throws Exception 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'+Create New City')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("shadnagar");
		Thread.sleep(1000);
		WebElement country=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[2]/span[1]/select[1]"));
		Select Cselect=new Select(country);
		Cselect.selectByIndex(1);
		Thread.sleep(1000);
		WebElement state=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[3]/span[1]/select[1]"));
		Select sselect=new Select(state);
		sselect.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		Thread.sleep(3000);
		String s7=driver.findElement(By.xpath("//div[contains(text(),'name is already taken. Please use another name')]")).getText();
		System.out.println(s7);
		Thread.sleep(3000);
		
	}
	
	@Test(priority=7)
	public void createcitywithoutname() throws Exception 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'+Create New City')]")).click();
		
		
		WebElement country=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[2]/span[1]/select[1]"));
		Select Cselect=new Select(country);
		Cselect.selectByIndex(1);
		Thread.sleep(1000);
		WebElement state=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[3]/span[1]/select[1]"));
		Select sselect=new Select(state);
		sselect.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		String s8=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/p[1]")).getText();
		System.out.println(s8);
		
	}
	@Test(priority=8)
	public void createcitywithoutstate() throws Exception 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'+Create New City')]")).click();
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("shadnagar");
		Thread.sleep(1000);
		WebElement country=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[2]/span[1]/select[1]"));
		Select Cselect=new Select(country);
		Cselect.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		String s9=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/p[3]")).getText();
		System.out.println(s9);
		
	}
	
	@Test(priority=9)
	public void createcitywithoutcountryandstate() throws Exception 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'+Create New City')]")).click();
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("shadnagar");
		Thread.sleep(1000);
		
		WebElement state=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[3]/span[1]/select[1]"));
		Select sselect=new Select(state);
		sselect.selectByIndex(0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		Thread.sleep(1000);
		String s10=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/p[2]")).getText();
		System.out.println(s10);
		
		String s11=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/p[3]")).getText();
		System.out.println(s11);
		
	}
	
	@Test(priority=9)
	public void createcitywithoutanydata() throws Exception 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'+Create New City')]")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		Thread.sleep(1000);
		String s12=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/p[1]")).getText();
		System.out.println(s12);
		String s13=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/p[2]")).getText();
		System.out.println(s13);
		String s14=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/p[3]")).getText();
		System.out.println(s14);
		Thread.sleep(1000);
	}
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void terminate()
	{
		driver.close();
	}

}
