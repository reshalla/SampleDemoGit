package co.pack.selenium_introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\path\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		System.out.println("Browser window maxmized");
		driver.get("https:google.com/");
		driver.navigate().to("https:rahulshettyacademy.com/");
		driver.navigate().back();
		System.out.println("Browser navigated back to google.com");
		driver.navigate().forward();
		System.out.println("Browser navigated forward to rahulshettyaceademy.com");

	}

}
