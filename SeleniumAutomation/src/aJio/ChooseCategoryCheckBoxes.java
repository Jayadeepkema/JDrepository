package aJio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChooseCategoryCheckBoxes {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		//driver.manage().window().maximize();
	}
	
	@Test
	public  void checkBoxTest()throws InterruptedException 
	{

		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"))
				.sendKeys("lee copper for men");

		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		
		//driver.findElement(By.xpath("//label[@for='Men']")).click();
	   
		driver.findElement(By.xpath("//div[@class='facet-more']")).click();
		 
		By alphatable = By.xpath("//div[@class='facet-filter-modal__search-alp-container']");
		WebElement alpha = driver.findElement(alphatable);
		
		List<WebElement>Alphabits = alpha.findElements(By.xpath(" //div[@class='item-selected ']"));
		
		int Alphabitscount = Alphabits.size();
		
		for(int i=0; i < Alphabitscount; i++)
		{
		         Alphabits.get(i).click();
		            
		             
			
		}
		
	
			
		}
	
		


@AfterMethod
    public void teardown() throws InterruptedException 
    {
	Thread.sleep(5000);
	driver.quit();
    }
    
    
}