package TestFlows;

import java.util.concurrent.TimeUnit;

import org.apache.poi.poifs.crypt.dsig.KeyInfoKeySelector;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.CalendarPicker;

public class testFlow1 {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhib\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://phyllis.b2bwave.com/profile/customers/sign_in");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("customer_email")).sendKeys("info+qa.e1@b2bwave.com");
		driver.findElement(By.id("customer_password")).sendKeys("qa81923b!");
		driver.findElement(By.name("commit")).click();
	}

	@Test(priority = 1)
	public void testFlow1Test1() throws InterruptedException {
		driver.navigate().to("https://phyllis.b2bwave.com/products/list?category=14");
		driver.findElement(By.name("order_product[1]quantity")).sendKeys("1");
		driver.findElement(By.name("order_product[1]quantity")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String message = driver.findElement(By.xpath("//div[contains(text(),'Product Cherries is not available')]")).getText();
		Assert.assertEquals(message, "Product Cherries is not available");

	}

	@Test(priority = 2)
	public void testFlow1Test2() {
		driver.navigate().to("https://phyllis.b2bwave.com/products/list?category=14");
		driver.findElement(By.name("order_product[3]quantity")).sendKeys("10");
		driver.findElement(By.name("order_product[3]quantity")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector(".btn.btn-info.cart-responsive.cart-desktop")).click();
		driver.findElement(By.cssSelector(".btn.btn-add-cart.btn-confirm.btn-success.confirm-button")).click();
		driver.findElement(By.id("order_request_delivery_at")).click();
		boolean cal = driver.findElement(By.id("ui-datepicker-div")).isDisplayed();
		Assert.assertTrue(cal);
	}

	@Test(priority = 3)
	public void testFlow1Test3() throws InterruptedException {
		driver.navigate().to("https://phyllis.b2bwave.com/products/list?category=14");
		driver.findElement(By.name("order_product[3]quantity")).sendKeys("10", Keys.ENTER);
		driver.findElement(By.cssSelector(".btn.btn-info.cart-responsive.cart-desktop")).click();
		driver.findElement(By.cssSelector(".btn.btn-add-cart.btn-confirm.btn-success.confirm-button")).click();
		driver.findElement(By.id("order_request_delivery_at")).click();
		CalendarPicker picker = new CalendarPicker();
		WebElement date = driver.findElement(By.id("order_request_delivery_at"));
		String dayVal = "2020-06-30";
		picker.selectDateByJS(driver, date, dayVal);
		driver.findElement(By.id("confirm-order-form-submit-button")).click();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://phyllis.b2bwave.com/orders/confirm_order_success");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
