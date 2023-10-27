package amzondrop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmzonDropDown {

	public static void main(String[] args)  {
	    
		WebDriverManager.chromedriver().setup();
		//ChromeOptions options= new ChromeOptions();
		//options.addArguments("-remote-allow-origins=*");
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
	    
	    driver.manage().window().maximize();
	    
	    WebElement drop=driver.findElement(By.id("searchDropdownBox"));
	    
	    List<WebElement>AllItems=(List<WebElement>) drop.findElements(By.tagName("option"));
	    
	    System.out.println(AllItems.size());
	    
	    for (WebElement item: AllItems) {
	    	
	    	System.out.println(item.getText());
	    	
	    }
	    
	    
        
	    driver.quit();
	}

}
