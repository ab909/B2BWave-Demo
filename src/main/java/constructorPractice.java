




public class constructorPractice {
	
	String name;
	int price;
	String engine;

    public constructorPractice(String name, int price, String engine) {
    	
    	this.name= name;
    	this.price = price;
    	this.engine = engine;
    
    }
	
	
	public static void main(String[] args) {
	
		constructorPractice obj1 = new constructorPractice("BMW", 10, "Automatic");
		constructorPractice obj2 = new constructorPractice("Mercedes", 20, "Manual");
		constructorPractice obj3 = new constructorPractice("Porsche", 40, "Automatic");
		
		System.out.println(obj1.name);

	}

}
