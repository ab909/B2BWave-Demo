

public class Ifelse {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		if (b>a) {
			System.out.println("b is greater than a");	
		} 
		else {
			System.out.println("a is greater than b");
		}	
	
	
	int c=30;
	int d=30;
	if(c==d) { 
		System.out.println("c is the same as d");
	}
	else {
		System.out.println("c is not same as d");
	}
	
	int a1 = 100;
	int b1 = 200;
	int c1 = 300;
	//nested if-else
	if(a1>b1 & a1>c1) {
		System.out.println("a1 is the greatest");
	}
		else if(b1>c1) {
		
			System.out.println("b1 is the greatest");
			
		}
		else { 
			System.out.println("c1 is the greatest");	
	}
}
}
