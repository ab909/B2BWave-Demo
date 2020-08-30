

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalVsGlobalVar {

	//global variables -- class variables
	String name = "tom";
	int age = 25;
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhib\\abc\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://amazon.ca");
		
		
		
		int i = 10; // local variable for main method
		System.out.println(i);
		
		LocalVsGlobalVar obj = new LocalVsGlobalVar();
		System.out.println(obj.name);
		System.out.println(obj.age);
		

	}
	
	public void sum() {
		int i=10; // local variable for sum method
		int j = 20;
		int age = 25;
				
	}

}
