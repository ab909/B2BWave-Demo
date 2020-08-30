

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhib\\Documents\\Selenium\\libs\\geckodriver.exe");
	 //	WebDriver driver= new FirefoxDriver (); 
		// htmlunitdriver-- is not available in Selenium 3.x version
		//to use this concept, we have to download the htmlunitdriver JAR file
		
		// advantages:
		//1. Testing is happening behind the scenes, no browser is launched
		//2. Very fast -- execution of test cases -- very fast -- performance of the script
		//3. not suitable for actions class (mouse movement, double click, drag and drop)
		//4. Also known as "Ghost Driver" or "headless browser"
		//5. can be used in conjunction with smoke testing or sanity testing
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.crmpro.com/");
		
		System.out.println("Before Login Title is:" + driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("hello999");
		driver.findElement(By.name("password")).sendKeys("welltodo");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		System.out.println("After Login Title is:" + driver.getTitle());
	}

}
