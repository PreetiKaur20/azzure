package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bro {
@Test
public void test() {
	System.out.println("testA");
	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(chromeOptions);
	
	// Navigate to the demoqa website
	driver.get("https://www.google.com");
	
	driver.quit();
	   
}
}
