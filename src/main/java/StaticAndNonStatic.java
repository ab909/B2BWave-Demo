

public class StaticAndNonStatic {
	
	String name = "Tom"; // non-static global variable
	static int age = 9; // static global variable

	public static void main(String[] args) {
		
		//how to call static methods:
		//1. direct calling  -- sum();
		sum();
		
		//2. calling by classname:
		
		StaticAndNonStatic.sum();
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
		//How to call non-static methods:
		
		//1. create an object -- StaticAndNonStatic obj = new StaticAndNonStatic();
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sendMail();
	}
	
	public void sendMail() {
		System.out.println("sendMail Method");
	}

	public static void sum() {
		System.out.println("sum method");
	}
	
}
