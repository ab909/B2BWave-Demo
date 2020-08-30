

public class ConstructorConcept {
	// class variables: instance variables (global variables)
	String name;
	int age;
	
	public ConstructorConcept() { // 0 parameter (default constructor)
		System.out.println("Default Const");
	}
	public ConstructorConcept(int i) { // 1 parameter
		System.out.println("1 parameter const");
		System.out.println(i);
	}
	public ConstructorConcept(int i, int j) { // 2 parameters
		System.out.println("2 parameter const");
		System.out.println(i+" "+j);
	}
	
	public ConstructorConcept(String name, int age) {
		this.name = name; // this.classvar = localvar
	    this.age = age;     // "this" keyword is used to initialize the class variables
	//	name=name1;
	//	age=age1;
	 
	}

	public static void main(String[] args) {
		// constructor is a function that doesn't return a value
		// constructor name will be the class name 
		// constructor cannot be created inside a method
        // to call the constructor of any class an object must be created
		// constructors can be overloaded (same name with different parameters passed)
		// constructor can be used to initialize class variables
		// constructor cannot be static in nature
		// the default constructor is also a hidden constructor 
		// "super" keyword will allow you to call a constructor, super keyword will be written in the child class constructor and must be the first statement
		ConstructorConcept obj= new ConstructorConcept();
		ConstructorConcept obj1= new ConstructorConcept(10);
		ConstructorConcept obj2= new ConstructorConcept(10,20);
		ConstructorConcept obj3= new ConstructorConcept("Tom",26);
		 System.out.println(obj3.name);
			System.out.println(obj3.age);
		
		
	}

}
