package aJio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.interactions.Actions;

public class AjioMenu {
	
	public void menubar()
{
		System.setProperty("WebDriver.chrome.driver", "./SeleniumAutomation\\\\Library\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String ApplicationUrlAddress = "https://www.ajio.com/";
		driver.get(ApplicationUrlAddress);
		
		//menu-newlist
		By menu=By.className("menu-newlist");
		WebElement menulist=driver.findElement(menu);
		
		By menubarlocator=By.tagName("title");
		List<WebElement>menubarLinks=menulist.findElements(menubarlocator);
		
		Actions action=new Actions((WebDriver) menulist);
		action.moveToElement(menulist).build().perform();
		
	
	
		
		
	}
	
	public static void main(String[] args) {
		
		AjioMenu MenuOfAjio=new AjioMenu();
		
		MenuOfAjio.menubar();
		
	}

}
