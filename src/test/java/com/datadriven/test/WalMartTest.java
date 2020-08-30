package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.TestUtil;

public class WalMartTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhib\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.walmart.ca/create-account");
	}
	
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();
	}
	
	@Test
	public void titleTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Walmart Canada");
	}
	
	
	@Test(dataProvider = "getTestData", priority=1)
	public void signUpTest(String email, String firstname, String lastname, String password, String confirmpassword) throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(), ' Close ')]")).click();

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(email);

		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("firstName")).sendKeys(firstname);

		driver.findElement(By.name("lastName")).clear();
		driver.findElement(By.name("lastName")).sendKeys(lastname);

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);

		driver.findElement(By.name("confirmPassword")).clear();
		driver.findElement(By.name("confirmPassword")).sendKeys(confirmpassword);

		driver.findElement(By.name("tnc")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("create-account-btn")).click();
}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
