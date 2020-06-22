package TestFlows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testFlow2 {

WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhib\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://phyllis.b2bwave.com/profile/customers/sign_in");
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.id("customer_email")).sendKeys("info+qa.e2@b2bwave.com");
			driver.findElement(By.id("customer_password")).sendKeys("qa81923b!");
			driver.findElement(By.name("commit")).click();
	}
	
	@Test
	public void testFlow2Test1() {
		driver.navigate().to("https://phyllis.b2bwave.com/products/list?category=9");
		String title=driver.getCurrentUrl();
		Assert.assertEquals(title, "https://phyllis.b2bwave.com/");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
