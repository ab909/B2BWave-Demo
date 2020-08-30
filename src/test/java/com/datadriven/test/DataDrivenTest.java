package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.xlsreader;

public class DataDrivenTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		xlsreader reader = new xlsreader("C:\\Users\\abhib\\eclipse-workspace\\DemoB2B\\src\\main\\java\\com\\testdata\\WalMartTestData.xlsx");	
		
		
		String email=reader.getCellData("TestData", "email", 2);
		System.out.println(email);
		
		String firstName=reader.getCellData("TestData", "firstname", 2);
		System.out.println(firstName);
		
		String lastName=reader.getCellData("TestData", "lastname", 2);
		System.out.println(lastName);
		
		String password=reader.getCellData("TestData", "password", 2);
		System.out.println(password);
		
		String confirmPassword=reader.getCellData("TestData", "confirmpassword", 2);
		System.out.println(confirmPassword);
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhib\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.walmart.ca/create-account");
		
		driver.findElement(By.xpath("//button[contains(text(), ' Close ')]")).click();
		 
	    driver.findElement(By.name("email")).sendKeys(email);
		
	    driver.findElement(By.name("firstName")).sendKeys(firstName);
		
	    driver.findElement(By.name("lastName")).sendKeys(lastName);
		
	    driver.findElement(By.name("password")).sendKeys(password);
		
	    driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
		
	    driver.findElement(By.name("tnc")).click();
	    
	    Thread.sleep(3000);
		
	    driver.findElement(By.id("create-account-btn")).click();
		
		
	}

}
