package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest2 {
	WebDriver driver;

	public void OrangeHRM_Navigate() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		String ApplicationUrlAddress = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(ApplicationUrlAddress);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		By username = By.name("username");
		WebElement usernamebox = driver.findElement(username);
		usernamebox.sendKeys("Admin");

		By password = By.name("password");
		WebElement passwordbox = driver.findElement(password);
		passwordbox.sendKeys("admin123");

		By login = By.xpath("//button[@type='submit']");
		WebElement loginbutton = driver.findElement(login);
		loginbutton.click();

	}

	public static void main(String[] args) {
		BaseTest2 mj = new BaseTest2();
		mj.OrangeHRM_Navigate();

	}

}
