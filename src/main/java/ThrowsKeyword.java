

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ThrowsKeyword {

	public static void main(String[] args) {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("ABC");
	}
		
		public void sum() {
			try {
				div();
				
		}catch (Throwable e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		}
		
		public void div() throws ArithmeticException{
			int i = 9/0; // execption line
		}

	}
	

// with try-catch block will catch the exeption and your program will not be terminated. 

// throws keyword is always put in front of the method, it is handled by JVM, as a result the program will be terminated. 

