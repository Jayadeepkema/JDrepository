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

public class AddEmployee {
	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String ApplicationURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(ApplicationURL);
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

		By pim = By.linkText("PIM");
		WebElement selectpim = driver.findElement(pim);
		selectpim.click();

		By addemp = By.linkText("Add Employee");
		WebElement addemployee = driver.findElement(addemp);
		addemployee.click();

		FileInputStream file = new FileInputStream("C:\\Users\\jayad\\Downloads\\OHRMLogindata.xlsx");
		XSSFWorkbook ExcelBook = new XSSFWorkbook(file);

		XSSFSheet sheet = ExcelBook.getSheet("Sheet2");
		int rowCount = sheet.getLastRowNum();

		for (int i = 1; i <= rowCount; i++) {

			XSSFRow currentRow = sheet.getRow(i);

			String FirstName = currentRow.getCell(0).getStringCellValue();
			String MiddleName = currentRow.getCell(1).getStringCellValue();
			String LastName = currentRow.getCell(2).getStringCellValue();

			Thread.sleep(3000);
			By empfirstname = By.name("firstName");
			WebElement addemployefirstname = driver.findElement(empfirstname);
			addemployefirstname.sendKeys(FirstName);
			System.out.println("The FirstName of employee is:-" +FirstName);
			

			Thread.sleep(3000);
			By empmiddlename = By.name("middleName");
			WebElement addemployemiddlename = driver.findElement(empmiddlename);
			addemployemiddlename.sendKeys(MiddleName);
			System.out.println("The FirstName of employee is:-" +MiddleName);
			
			

			Thread.sleep(3000);
			By emplastname = By.name("lastName");
			WebElement addemployelastname = driver.findElement(emplastname);
			addemployelastname.sendKeys(LastName);
			System.out.println("The FirstName of employee is:-" +LastName);
			
			
			
			Thread.sleep(3000);
			By saveBtn = By.xpath("//button[@type='submit']");
            WebElement saveButton = driver.findElement(saveBtn);
            saveButton.click();
            System.out.println("The AddEmployee is Name is Saved Successfully");

		}

	}

}
