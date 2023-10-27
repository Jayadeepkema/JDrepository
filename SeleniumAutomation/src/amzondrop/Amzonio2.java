package amzondrop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amzonio2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "./SeleniumAutomation\\Library\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String ApplicationURLAddress = "https://www.ajio.com/";
		driver.get(ApplicationURLAddress);
		
		//driver.manage().window().maximize();
		
		   By headerBlockLocator=By.className("menu-newlist");
           WebElement headerBlock =driver.findElement(headerBlockLocator);
           
           By headerBlockLinksLocator=By.tagName("li");
           List<WebElement>headerBlockLinks =driver.findElements(headerBlockLinksLocator);
           
           Actions action=new Actions(driver);
           action.moveToElement(headerBlock).build().perform();
           
           Thread.sleep(8000);
           
           driver.quit();
	}

}
