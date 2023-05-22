package Base;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static String URL = "https://demoqa.com/buttons";
	public static WebDriver driver;
	
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
}
	
	@AfterTest
	public static void End() {
		driver.quit();
	}
}
