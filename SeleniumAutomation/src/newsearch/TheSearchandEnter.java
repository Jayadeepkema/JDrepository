package newsearch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TheSearchandEnter {

	WebDriver driver;
    String baseUrl;
    

	@BeforeMethod
	public void setup() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		 baseUrl="https://www.ajio.com/";
		 
		 driver.get(baseUrl);
		driver.manage().window().maximize();

	}

	@Test
	public void searchTest() throws InterruptedException  {

		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"))
				.sendKeys("lee copper for men");

		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		
		driver.findElement(By.xpath("//label[@for='Men']")).click();
	   
		driver.findElement(By.xpath("//div[@class='facet-more']")).click();
		
	   driver.findElement(By.xpath("//div[text()='c']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//label[@for='modal-Men - Casual Shoes']")).click();
	   driver.findElement(By.xpath("//div[@class='item-selected active-alp']")).click();
	   
	   driver.findElement(By.xpath("//div[text()='f']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//label[@for='modal-Men - Flip Flop & Slippers']")).click();
	   driver.findElement(By.xpath("//label[@for='modal-Men - Formal Shoes']")).click();
	   driver.findElement(By.xpath("//div[@class='item-selected active-alp']")).click();
	   
	   driver.findElement(By.xpath("//div[text()='j']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//label[@for='modal-Men - Jackets & Coats']")).click();
	   driver.findElement(By.xpath("//label[@for='modal-Men - Jeans']")).click();
	   driver.findElement(By.xpath("//div[@class='item-selected active-alp']")).click();
	   
	   driver.findElement(By.xpath("//div[text()='s']")).click();
	  Thread.sleep(2000);
	   driver.findElement(By.xpath("//label[@for='modal-Men - Sandals']")).click();
	   driver.findElement(By.xpath("//label[@for='modal-Men - Shirts']")).click();
	   driver.findElement(By.xpath("//label[@for='modal-Men - Shorts & 3/4ths']")).click();
	   driver.findElement(By.xpath("//label[@for='modal-Men - Sneakers & Sports Shoes']")).click();
	  // driver.findElement(By.xpath("//label[@for='modal-Men - Socks']")).click();
	   driver.findElement(By.xpath("//label[@for='modal-Men - Sweaters & Cardigans']")).click();
	   driver.findElement(By.xpath("//label[@for='modal-Men - Sweatshirt & Hoodies']")).click();
	   driver.findElement(By.xpath("//div[@class='item-selected active-alp']")).click();

	   
	   driver.findElement(By.xpath("//div[text()='t']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//label[@for='modal-Men - Track Pants']")).click();
	   driver.findElement(By.xpath("//label[@for='modal-Men - Trousers & Pants']")).click();
	   driver.findElement(By.xpath("//label[@for='modal-Men - Tshirts']")).click();
	   driver.findElement(By.xpath("//div[@class='item-selected active-alp']")).click();
	   
	   driver.findElement(By.xpath("//div[text()='w']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//label[@for='modal-Men - Watches']")).click();
	   driver.findElement(By.xpath("//div[@class='item-selected active-alp']")).click();
	   
	   
	   driver.findElement(By.xpath("//button[text()='Clear All']")).click();
		
	
		
		}
		 
	
	@AfterTest
	public void teardown() throws InterruptedException {

		Thread.sleep(3000);

		driver.quit();

	}

}