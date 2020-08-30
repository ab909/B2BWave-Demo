

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import org.openqa.selenium.By;

public class FindElementReview {

	public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.gecko.driver","C:\\Users\\abhib\\Documents\\Selenium\\libs\\geckodriver.exe");
		WebDriver qa= new FirefoxDriver();
		
		qa.manage().window().maximize();
		qa.manage().deleteAllCookies();
		
		qa.get("https://amazon.ca");
		//getting the total number of links on the page
		
		List <WebElement> linkList = qa.findElements(By.tagName("span"));
		
		System.out.println(linkList.size());
		
		for(int a=0;a<linkList.size();a++) {
			String l= linkList.get(a).getText();
			
			System.out.println(l);
			
		}
	}

}
