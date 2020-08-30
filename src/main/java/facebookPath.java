

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookPath {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhib\\Documents\\Selenium\\libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("myown xpath");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("automation practice");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("hello");
		
		
		// custom css selector - htmlTag[attribute='value']
		
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByIndex(9);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\abhib\\Desktop\\Selenium Screenshots\\screenshot.png"));

	}

}
