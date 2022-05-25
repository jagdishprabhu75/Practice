package demoProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	public static WebDriver driver;

	@BeforeMethod
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "c:\\misc\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void Test1() {
		driver.get("https://automationtalks.com/");
		System.out.println(driver.getTitle());
	}

	@Test
	public void Test2() {
		driver.get("https://automationtalks.com/");
		System.out.println(driver.getTitle());
	}

	@Test
	public void Test3() {
		driver.get("https://automationtalks.com/");
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}
}