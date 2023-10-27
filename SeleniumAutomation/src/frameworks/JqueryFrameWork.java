package frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryFrameWork {
	
	public void Frame_dragmeToMyTagetGetText() 
	{
		System.setProperty("WebDriver.chrome.driver", "./SeleniumAutomation\\Library\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String ApplicationURLAddress = "https://jqueryui.com/droppable/";
		driver.get(ApplicationURLAddress);
		
		By WebPageframeproperty=By.className("demo-frame");
		WebElement WebPageFrame=driver.findElement(WebPageframeproperty);
		
	
		driver.switchTo().frame(WebPageFrame);
		
		By dragMeToMyTargetProperty=By.id("draggable");
		WebElement dragmetomyTarget=driver.findElement(dragMeToMyTargetProperty);
		
		String dragmetomyTarget_Text=dragmetomyTarget.getText();
		System.out.println("The text of an Element dragmetomyTarget is:-"+dragmetomyTarget_Text);
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		
		JqueryFrameWork jquery=new JqueryFrameWork();
		jquery.Frame_dragmeToMyTagetGetText();
		
	}

}
