package youTube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class YouTubeSearch {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String ApplicationURL = "https://www.youtube.com";
		driver.get(ApplicationURL);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		By searchbox = By.xpath("//input[@placeholder='Search']");
		WebElement Searchboxproperty = driver.findElement(searchbox);
		Searchboxproperty.sendKeys("deva shree ganesha");
		Searchboxproperty.sendKeys(Keys.ENTER);
		
         //selecting video to play
		WebElement ele = driver.findElement(By.xpath(
				"/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/ytd-thumbnail/a/yt-image/img"));
		ele.click();
		
		//Skip the Ad if it is showing skipAd
		Thread.sleep(3000);
		 WebElement ele2 = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[1]/div[2]/div/div/ytd-player/div/div/div[21]/div/div[3]/div/div[2]/span/button/div"));
		 ele2.click();
		 
		//WebElement fullscreen = driver.findElement(By.xpath("//button[@title='Full screen (f)']"));
		//fullscreen.click();
		
		Thread.sleep(4000);
		
		By settings =  By.xpath("//button[@class='ytp-button ytp-settings-button']");
		WebElement settingsbutton = driver.findElement(settings);
		settingsbutton.click();
		
		Thread.sleep(8000);
		
		
		By quality = By.linkText("Quality");
		WebElement Qualitysetting = driver.findElement(quality);
		Qualitysetting.click();



	}

}
