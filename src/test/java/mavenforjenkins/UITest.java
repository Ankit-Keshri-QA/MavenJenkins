package mavenforjenkins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest {

	@Test
	public void startBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");

		Assert.assertEquals(driver.getTitle(), "BlazeDemo", "Title Does not match");

		driver.close();

	}

}
