

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileHandlingVideo {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\abhib\\Documents\\Selenium\\libs\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver ();
		
		driver.get("http://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\abhib\\Desktop\\helloselenium.txt");
		
		driver.findElement(By.cssSelector("a.pm-cta:nth-child(1)")).click();
		
		

	}

}
