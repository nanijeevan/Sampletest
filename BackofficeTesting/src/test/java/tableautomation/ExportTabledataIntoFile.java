package tableautomation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExportTabledataIntoFile {
	
	
	WebDriver driver;
	@BeforeTest
	public void browserlaunch() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bo-dev.nslsdev.com/");
		driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
		driver.findElement(By.id("password")).sendKeys("AdminOne@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
	
	}
	
	@Test
	public void table() throws Exception
	{
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/nav[2]/ul[1]/li[2]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(text(),'States, Cities')]")).click();
	Thread.sleep(1000);
	String s1=driver.findElement(By.xpath("//div[@class='widget-createuser widget-p-sm']")).getText();
	
	String s2=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]")).getText();
	System.out.println(s2);

	String s4=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/main[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[2]/span[1]/span[4]")).getText();
	System.out.println(s4);
	
//	PrintStream ps=new PrintStream(new File("D:\\testing\\demo2.csv")); 
//	//OutputStream ot=new OutputStream(new File("D:\\testing\\demo2.csv"));
//	System.setOut(ps);
//	ps.print(s4);
	


	
	
	//converting String to Integer
//	int i=Integer.parseInt(s4);  
//	//Printing value of i  
//	System.out.println(i); 
	
	/////////////////
	}

}
