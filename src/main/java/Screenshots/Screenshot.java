package Screenshots;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	public static String URL = "https://letcode.in/table";
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(URL);

		TakesScreenshot shot = ((TakesScreenshot) driver);

		File srcfile = shot.getScreenshotAs(OutputType.FILE);

		String DestAddress = "/Users/VE20463903/Desktop/eclipse-workspace/Victory/src/main/java/Screenshot/one.png";

		File fileDest = new File(DestAddress);

	//
		FileUtils.copyFile(srcfile, fileDest);

	}

}
