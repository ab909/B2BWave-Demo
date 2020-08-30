

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cartForEcommerce {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhib\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		int j=0;
		
		String[] itemsNeeded= {"Cucumber", "Brocolli", "Beetroot", "Carrot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		 List <WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));
		 
		 for(int i=0;i<product.size();i++) {
			
			 // Brocolli - 1 Kg
			 
			 String[] name= product.get(i).getText().split("-");
			 String formattedName=name[0].trim();
			// format it to get actual vegetable bame
			// check whether name you have extracted is present in arrayList or not
			// convert array into arraylist for an easy search
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			
			if(itemsNeededList.contains(formattedName)) {
				
				j++;
				
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				//3 times
				if(j==itemsNeeded.length) {
					break;
				}
					
				
			}
		 }

	}

}
