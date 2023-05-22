package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass3 {
	public WebDriver driver;
	public WebDriverWait nil;
	public static Actions act;
	
	
	@BeforeTest
	public void start() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		nil=new WebDriverWait(driver, Duration.ofSeconds(3));
		act = new Actions(driver);
	
	}
	
	@AfterTest
	public void end() {
		
		driver.quit();
	}

}
