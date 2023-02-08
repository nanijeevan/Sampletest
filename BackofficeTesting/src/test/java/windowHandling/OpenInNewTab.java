package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenInNewTab {
static WebDriver driver;



	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		// Load the website
		driver.get("https://bo-dev.nslsdev.com/dashboard/");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("AdminOne@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/nav[2]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'States, Cities')]")).click();
		Thread.sleep(1000);
		String parentWindow=driver.getWindowHandle();
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		driver.findElement(By.xpath("//a[contains(text(),'Question Bank')]")).sendKeys(selectLinkOpeninNewTab);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Boards')]")).sendKeys(selectLinkOpeninNewTab);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Question Paper')]")).sendKeys(selectLinkOpeninNewTab);
		
		
		

		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		    	   
		          {
		          driver.switchTo().window(windowHandle);
		        String url=  driver.getCurrentUrl();
		        System.out.println(url);
		       //  <!--Perform your operation here for new window-->
		        // driver.close(); //closing child window
		        // driver.switchTo().window(parentWindow); //cntrl to parent window
		          }
		       }
		   driver.switchTo().newWindow(WindowType.TAB);
		   driver.get("http://google.com/");
		  // driver.switchTo().newWindow(WindowType.WINDOW);
	}

}
