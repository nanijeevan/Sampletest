package testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
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
		String parent=driver.getWindowHandle();
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		driver.findElement(By.xpath("//a[contains(text(),'Question Bank')]")).sendKeys(selectLinkOpeninNewTab);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Boards')]")).sendKeys(selectLinkOpeninNewTab);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Question Paper')]")).sendKeys(selectLinkOpeninNewTab);
		// It will return the parent window name as a String
		
//// Method 1
//		Set<String>s=driver.getWindowHandles();
//
//		// Now iterate using Iterator
//		Iterator<String> I1= s.iterator();
//
//		while(I1.hasNext())
//		{
//
//		String child_window=I1.next();
//
//
//		if(!parent.equals(child_window))
//		{
//		driver.switchTo().window(child_window);
//
//		System.out.println(driver.switchTo().window(child_window).getTitle());
//
//	
//		}
//
//		}
//		//switch to the parent window
//		driver.switchTo().window(parent);

		
		
		
		// Method 2
		// Store the current window handle
//		String winHandleBefore = driver.getWindowHandle();
//
//		// Perform the click operation that opens new window
//
//		// Switch to new window opened
//		for(String winHandle : driver.getWindowHandles()){
//		    driver.switchTo().window(winHandle);
//		}
//
//		// Perform the actions on new window
//
//		// Close the new window, if that window no more required
//		driver.close();

		// Switch back to original browser (first window)
		//driver.switchTo().window(winHandleBefore);

		// Continue with original browser (first window)
		
		
		
		//Method 3
		
		String parentWindow = driver.getWindowHandle();
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
	   
	     Set<String> s1=driver.getWindowHandles();
	     
	     for(String windowhandle: s1)
	     {
	    	 if(!parentWindow.equals(windowhandle))
	    	 {
	    		 driver.switchTo().window(windowhandle);
	    	 }
	     }
		
	       
		}
		

	}


