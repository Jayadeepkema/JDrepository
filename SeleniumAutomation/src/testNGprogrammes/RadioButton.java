package  testNGprogrammes;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void radioButtonTest() throws InterruptedException
	{
		
		
		List<WebElement> allRadios=driver.findElements(By.xpath("//input[@name='group1']"));
		
		
		
		for(WebElement radio:allRadios)
		{
			System.out.println(radio.getAttribute("checked"));
			
			Thread.sleep(4000);
		}
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		
		driver.quit();
	}
	
	
}