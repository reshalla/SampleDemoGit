package selenium_misc_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_cookies_demo {

	public static void main(String[] args) {
		// ChromeBrowser open
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\path\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//deleting cookies
		
		driver.manage().deleteAllCookies();

	}

}
