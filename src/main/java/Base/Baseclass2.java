package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass2 {

	public static String Chromedriver = "/Users/VE20463903/Downloads/chromedriver_mac_arm64/chromedriver";
	public static String URL = "https://demoqa.com/automation-practice-form";
	public static WebDriver driver;
	public static Actions act;

	@BeforeTest
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterTest

	public void end() {

		driver.quit();
	}

}
