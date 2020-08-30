

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingCalendars {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhib\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.crmpro.com/");

		driver.findElement(By.name("username")).sendKeys("hello999");
		driver.findElement(By.name("password")).sendKeys("welltodo");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".btn.btn-small")).click();

		driver.switchTo().frame("mainpanel");

		String date1 = "31-July-2020";

		String dateArray[] = date1.split("-");
		String day = dateArray[0];
		String month = dateArray[1];
		String year = dateArray[2];

		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);

		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);

		driver.findElement(By.xpath("//td[contains(text(),'10')]")).click();

		Thread.sleep(3000);

		String beforeXpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterXpath = "]/td[";

		boolean flag = false;
		String dayValue = null;

		final int totalWeekdays = 7;

		//
		for (int rowNum = 2; rowNum <= 7; rowNum++) {
			for (int colNum = 1; colNum <= totalWeekdays; colNum++) {

				try {
					dayValue = driver.findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]")).getText();
				} catch (NoSuchElementException e) {
					System.out.println("Please Enter a Correct Date");
					flag = false;
					break;
				}

				System.out.println(dayValue);
				if (dayValue.equals(day)) {
					driver.findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]")).click();
					flag=true;
					break;

				}

		
			}
			
			if(flag) {
				break;
			}
		}
		

	}

}
