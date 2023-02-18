package selenium_misc_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HttpCertification_demo {

	public static void main(String[] args) {

		// accepting insecure certificates
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		// ChromeBrowser open
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\path\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		// opening the URL
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());

	}

}
