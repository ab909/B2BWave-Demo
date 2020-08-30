

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DymanicWebTableHandle {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhib\\Desktop\\chromedriver_win32 (5)\\chromedriver.exe");
		
		WebDriver web= new ChromeDriver();
		
		web.manage().window().maximize();
		web.manage().deleteAllCookies();
		
		web.get("https://www.crmpro.com/");
		
		web.findElement(By.name("username")).sendKeys("hello999");
		web.findElement(By.name("password")).sendKeys("welltodo");
		Thread.sleep(5000);
		
		web.findElement(By.xpath("//input[@type='submit']")).click();
		
		web.switchTo().frame("mainpanel");
		
		Thread.sleep(3000);

		web.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[5]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[6]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[7]/td[2]/a
		
		//Method 1:
	//	String before_xpath="//*[@id='vContactsForm']/table/tbody/tr[";
	//	String after_xpath= "]/td[2]/a";
		
	//	for(int i=4;i<=6;i++) {
	//		String name= web.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
	//		System.out.println(name);
	//		if(name.contains("test test")) {
				
	//			web.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
		
//}
//}	
		//Method 2:
		
		web.findElement(By.xpath("//a[contains(text(), 'test test')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();

		//*[@id="commissionTable"]/tbody/tr[1]/td[1]
		
		
		
}
}