package adactinHotelAppLogin;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMApplication2 {

	FileInputStream file;
	XSSFWorkbook workbook;
	XSSFRow currentRow;
	int rowCount;
	WebDriver driver;
	String user_name;
	String pasword;
	By OHRMUsername;
	WebElement userid;
	By OHRMPassword;
	WebElement userpassword;
	By OHRMLogin;
	WebElement loginbutton;
	String currentURLAfterLogin;
	By Admin;
	WebElement Adminclick;

	public void LoginOHRM() throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String ApplicationUrlAddress = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(ApplicationUrlAddress);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		FileInputStream file = new FileInputStream("C:\\Users\\jayad\\Downloads\\OHRMLogindata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int rowCount = sheet.getLastRowNum();

//Loop for Validate TestData from ExcelSheet
		for (int i = 1; i <= rowCount; i++) {

			XSSFRow currentRow = sheet.getRow(i);

			String user_name = currentRow.getCell(0).getStringCellValue();
			String pasword = currentRow.getCell(1).getStringCellValue();

			By username = By.name("username");
			WebElement usernamebox = driver.findElement(username);
			usernamebox.sendKeys(user_name);

			By password = By.name("password");
			WebElement passwordbox = driver.findElement(password);
			passwordbox.sendKeys(pasword);

			By login = By.xpath("//button[@type='submit']");
			WebElement loginbutton = driver.findElement(login);
			loginbutton.click();

			String titlteofpage = driver.getTitle();
			System.out.println("the title of page is:-" + titlteofpage);

			String actualtitle = driver.getCurrentUrl();
			System.out.println("The Actual URL After Login Is :-" + actualtitle);

			String Expected_Element = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
			String Actual_Element = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

			String Expected_Element2 = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			String Actual_Element2 = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

			if (actualtitle.equals(Expected_Element)) {
				if (Expected_Element.equals(Actual_Element)) {
					Admin = By.xpath("//span[@class='oxd-userdropdown-tab']");
					Adminclick = driver.findElement(Admin);
					Adminclick.click();
					Thread.sleep(4000);
					By LogoutOHRM = By.linkText("Logout");
					WebElement logoutEle = driver.findElement(LogoutOHRM);
					logoutEle.click();
					System.out.println("pass");
				} else {

					System.out.println("fail");
				}

			} else if (actualtitle.equals(Expected_Element2)) {
				if (Expected_Element2.equals(Actual_Element2)) {

					System.out.println("invalid credeentials");

				} else {
					Admin = By.xpath("//span[@class='oxd-userdropdown-tab']");
					Adminclick = driver.findElement(Admin);
					Adminclick.click();
					Thread.sleep(4000);
					By LogoutOHRM = By.linkText("Logout");
					WebElement logoutEle = driver.findElement(LogoutOHRM);
					logoutEle.click();
					System.out.println("pass");
				}

			}

		}

		workbook.close();

		driver.close();

	}

	public static void main(String[] args) throws IOException, InterruptedException {

		OrangeHRMApplication2 Loginwithexceldata = new OrangeHRMApplication2();
		Loginwithexceldata.LoginOHRM();

	}
}
