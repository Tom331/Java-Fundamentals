package inheritance;

public class Tester {
	
	
	
	public static void main(String[] args) {
		IAnimal animal = new Dog(true); //Even though you have a reference to the Animal class (the base class), 
										  //since the object is of type Dog it will call the
										  // Dog makeNoise() function which is specified in the
										  // Dog class and overrides the Animal makeNoise() function
		
		animal.makeNoise();
		
//		Animal myCat = new Cat("White");
//		myCat.makeNoise();
		
		//System.out.println(myCat.furColor);
		
		//myDog.fetchBall();
		//myCat.sleep(); //Since this is an Animal object, it can't access the Cat class methods directly
					     //See below for solution to this:
					   
//		myCat.doSomething();
		animal.doSomething(); //Since we didn't specify a doSomething() method in the Dog class,
							 //it will use the Animal class' default doSomething() method. 
		
		System.out.println("The _____ is awake: " + animal.isAwake());
		animal.putToBed();
		
		System.out.println("The _____ is awake: " + animal.isAwake());
	}

}
