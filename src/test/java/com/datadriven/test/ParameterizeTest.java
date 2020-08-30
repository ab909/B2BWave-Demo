package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.xlsreader;

public class ParameterizeTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhib\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.walmart.ca/create-account");
		
		xlsreader reader = new xlsreader("C:\\Users\\abhib\\eclipse-workspace\\DemoB2B\\src\\main\\java"
				+ "\\com\\testdata\\WalMartTestData.xlsx");
		int rowCount = reader.getRowCount("TestData");
		
		reader.addColumn("TestData", "Status");

		for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
			System.out.println("========");
			String email = reader.getCellData("TestData", "email", rowNum);
			System.out.println(email);

			String firstname = reader.getCellData("TestData", "firstname", rowNum);
			System.out.println(firstname);

			String lastname = reader.getCellData("TestData", "lastname", rowNum);
			System.out.println(lastname);

			String password = reader.getCellData("TestData", "password", rowNum);
			System.out.println(password);

			String confirmpassword = reader.getCellData("TestData", "confirmpassword", rowNum);
			System.out.println(confirmpassword);


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
			
			reader.setCellData("TestData", "Status", rowNum, "Pass");

		}
	}

}
