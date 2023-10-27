package testNGprogrammes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutlipleWindowHandle {
	WebDriver driver;
	
@BeforeMethod
      public void setUp() {
	
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	
	driver.get("https://adactinhotelapp.com/");
	
	driver.manage().window().maximize();
}
@Test
   public void mutliplewindowTest() throws InterruptedException {
	
     String homewindow=driver.getWindowHandle();
     
     driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
     
     Set<String> allwindowsids= driver.getWindowHandles();
     
     Iterator<String>it=allwindowsids.iterator();
     
     while (it.hasNext()) {
    	 
    	 String currentwindowId= it.next();
    	 
    	 driver.switchTo().window(currentwindowId);
    	 
    	 if(driver.getTitle().equals("Android Apps on Gooogle Play"))
    	 {
    		 break;
    	 }
    	 
     }
    	  driver.findElement(By.xpath("//span[text()='Games']/parent::span/parent::button")).click();
    	  
    	  Thread.sleep(8000);
    	  
    	  driver.switchTo().window(homewindow);
    	  
    	  Thread.sleep(8000);
    	  
    	  driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
    	  
    	  allwindowsids=  driver.getWindowHandles();
    	  
    	  it=allwindowsids.iterator();
    	  
    	  while(it.hasNext()) {
    		  
    		  String currentWindowId=it.next();
    		  
    		  driver.switchTo().window(currentWindowId);
    		  
    		  Thread.sleep(8000);
    		  
    		  if(driver.getTitle().equals("TestFlight-Apple")) {
    			  break;
    		  }
    		  
    	  }
    	  
    	  Thread.sleep(8000);
		  
		  driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
    	 
     }
     
     @AfterMethod
       public void teardown() throws InterruptedException {
    	 
    	 Thread.sleep(8000);
    	 
    	 driver.quit();
     }
       
       
	
}

