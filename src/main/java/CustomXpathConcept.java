

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class CustomXpathConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhib\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://amazon.ca");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("proraso");
		
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		String text=driver.findElement(By.xpath("//span[contains(text(), 'Skin Care Products')]")).getText();
		
		System.out.println(text);
		
		//
		
		

	}

}
