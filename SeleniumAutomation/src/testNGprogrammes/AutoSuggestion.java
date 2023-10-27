package testNGprogrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {
WebDriver driver;

@BeforeMethod

public void setup() {
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();

	driver.get("https://www.amazon.in/");

	driver.manage().window().maximize();
}

@Test
    public void mouseHoverTest() {
	
	     Actions action=new Actions(driver);
	     
	     action.sendKeys(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")), "harry potter").pause(2000)
	     
	     .sendKeys(Keys.ARROW_DOWN)
	     .pause(2000)
	     .sendKeys(Keys.ARROW_DOWN)
	     .pause(2000)
	     .sendKeys(Keys.ENTER)
	     .build()
	     .perform();     
}
@AfterMethod
     public void teardown() throws InterruptedException  
     {
	      Thread.sleep(5000);
	      driver.quit();
	    
}
}
