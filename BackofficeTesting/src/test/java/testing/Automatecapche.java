package testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.Tesseract1;

public class Automatecapche {

	
	WebDriver driver;
	@Test
	public void browserlaunch() throws InterruptedException, Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
			
		
		driver.manage().window().maximize();
		//driver.get("https://www.irctc.co.in/nget/train-search");
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		//Thread.sleep(2000);
		
	//	driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]")).click();
		Thread.sleep(2000);
		
		WebElement e1=driver.findElement(By.xpath("//*[@id=\"login_header_disable\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/div[4]/div/app-captcha/div/div/div[2]/span[1]/img"));
		File src=e1.getScreenshotAs(OutputType.FILE);
		
		
		
		String path=	"C:\\Users\\TOSHIBA\\eclipse-workspace\\BackofficeTesting\\capcheimages\\imag6.png";
		FileHandler.copy(src, new File(path));
		
		
		Tesseract tesseract=new Tesseract();
		//tesseract.setDatapath("C:\\Users\\TOSHIBA\\eclipse-workspace\\BackofficeTesting\\tessdata");
		tesseract.setDatapath("D:\\Tess4J\\tessdata");
        String str1=tesseract.doOCR(new File(path));
		System.out.println("image captured");
		System.out.println(str1);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.xpath("//input[@id='captcha']")).sendKeys(str1);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'SIGN IN')]")).click();
		
		
		}
	
	//@AfterTest
	public void termimate()
	{
		driver.close();
	}
		
	}


