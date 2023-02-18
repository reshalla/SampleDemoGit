package selenium_locators_demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsE2ESelenium {

	public static void main(String[] args) throws InterruptedException {

		// ChromeBrowser open
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\path\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// telling browser to wait implicitly until all the objects appeared and then
		// only perform the action
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// directly to the specific WebSite
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// validating with wrong credentials
		driver.findElement(By.id("inputUsername")).sendKeys("areshma");
		driver.findElement(By.name("inputPassword")).sendKeys("allareshma123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();

		// telling browser to pause for some seconds until it's transition from one page
		// to another is done
		Thread.sleep(1000);

		// setting up with credentials and hitting reset login
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("areshma");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("reshalla01@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9807234567");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p:nth-child(2)")).getText());

		// navigating back to sign up page
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

		// telling browser to pause for some seconds until it's transition from one page
		// to another is done
		Thread.sleep(2000);

		// validating with correct credentials
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("areshma");
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.cssSelector("button[class*='submit']")).click();

		// landing inside the WebSite after sign up validation and clicking on logout
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
		System.out.println(driver.findElement(By.tagName("p")).getText());
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		System.out.println("Logged out successfully");

	}

}
