package selenium_locators_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsParsingPasswordDynamic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\path\\Documents\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String password = getPassword(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// validating with correct credentials
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("areshma");
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.cssSelector("button[class*='submit']")).click();

		// landing inside the WebSite after sign up validation and clicking on logout
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
		System.out.println(driver.findElement(By.tagName("p")).getText());
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		System.out.println("Logged out successfully");

	}

	public static String getPassword(WebDriver driver) throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String pwdText1 = driver.findElement(By.xpath("//form/p")).getText();
		String[] pwdText2 = pwdText1.split("'");
		String[] pwdText3 = pwdText2[1].split("'");
		String pwdText4 = pwdText3[0];
		return pwdText4;
	}
}