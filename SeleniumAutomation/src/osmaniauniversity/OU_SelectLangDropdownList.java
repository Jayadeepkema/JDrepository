package osmaniauniversity;

import java.io.File;
//import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OU_SelectLangDropdownList {

	WebDriver driver;
    
	public static void main(String[] args) throws IOException, InterruptedException {
		

		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\jayad\\jaideepworkspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		

		String ApplicationUrlAddress = "https://www.osmania.ac.in/";
		driver.get(ApplicationUrlAddress);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		By SelectLanguageLocator = By.id("gtranslate_selector");
		WebElement SelectLangLink = driver.findElement(SelectLanguageLocator);
		SelectLangLink.click();
		
		
/*
		OU_ScreenShot screenshot = new OU_ScreenShot();
		screenshot.CapturingScreenShot(driver);
	*/	
		

		By SelectLangOptions = By.tagName("option");
		List<WebElement> SelectLangOPtionsLinks = driver.findElements(SelectLangOptions);

		int SelectLangOptionsCount = SelectLangOPtionsLinks.size();
		
		Select LanguageSelection = new Select(SelectLangLink);
		System.out.println("The No of Options to select Languages are:-"+SelectLangOptionsCount);
		
		for(int index=0; index < SelectLangOptionsCount; index++)
		{
			LanguageSelection.selectByIndex(index);
			String SelectedLangName = SelectLangOPtionsLinks.get(index).getText();
			
			System.out.println(index+"   "+SelectedLangName);
			

			
			
         
			Thread.sleep(2000);
			File ouscreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(ouscreenshot, new File("./Screenshot/OsmaniaUniversity "+index+"  "+SelectedLangName+".png"));
			
			
			
			
			System.out.println();
			
			
		}


	}
}