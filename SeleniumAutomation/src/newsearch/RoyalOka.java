package newsearch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RoyalOka {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.royaloakindia.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void royalokaTest() throws InterruptedException {

		driver.findElement(By.xpath("//span[@class='text-lg font-bold pt-3']")).click();
		driver.findElement(By.id("pincode")).sendKeys("501505");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//button[@class='hidden items-center pr-1 text-left md:flex']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='absolute top-8 right-8 z-40']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='flex items-center pr-1 text-left']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='absolute top-8 right-8 z-40']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='flex cursor-pointer']")).click();
		Thread.sleep(3000);

		
		driver.findElement(By.linkText("register")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("firstname")).sendKeys("Henry");
		driver.findElement(By.id("lastname")).sendKeys("cavill");
		driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div/form/div[2]/div/div/div[1]/input"))
				.sendKeys("9848982088");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("henrycavill@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Henryc@vill#123");
		driver.findElement(By.xpath("//button[@class='absolute top-3 inset-y-0 right-0 flex items-center p-1 mr-3 rounded-lg focus:outline-none focus:ring focus:ring-primary-500']")).click();
		Thread.sleep(3000);

		driver.navigate().back();

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,7300)");
		Thread.sleep(3000);

		//driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[4]/div/div[2]/button")).click();

		driver.findElement(By.linkText("ROYALOAK STORES")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		String currentHandle = driver.getWindowHandle();
		driver.findElement(By.linkText("MEDIA")).click();
		//Thread.sleep(3000);
		
		JavascriptExecutor  se= (JavascriptExecutor)driver;
		se.executeScript("window.scrollBy(0,2500)");
		//Thread.sleep(3000);

		driver.findElement(By.xpath("//img[@src='https://royaloakindia.com/media/.renditions/wysiwyg/My_project-1_-_2023-03-10T171528.146.png']")).click();
		

		System.out.println("pincode is 501505");

	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);

		driver.quit();

	}

}
