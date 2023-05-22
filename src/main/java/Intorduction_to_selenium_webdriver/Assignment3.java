package Intorduction_to_selenium_webdriver;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
	
	public static String URL = "https://opensource-demo.orangehrmlive.com/";
	
	public static WebDriver driver;
	
	public static void main(String[] args)throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
	
		
		
		
		
		driver.get(URL);
		
		Thread.sleep(2500);
		
		
		//userName
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		
		//asssword
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	   
		//login
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	    
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		
		

		
		Thread.sleep(2000);
       
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		
		
//		driver.close();
	}

}
