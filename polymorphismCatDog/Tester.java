package polymorphismCatDog;

public class Tester {
	
	
	
	public static void main(String[] args) {
		Animal myDog = new Dog("Black"); //Even though you have a reference to the Animal class (the base class), 
										  //since the object is of type Dog it will call the
										  // Dog makeNoise() function which is specified in the
										  // Dog class and overrides the Animal makeNoise() function
		
		myDog.makeNoise();
		
		Animal myCat = new Cat("White");
		myCat.makeNoise();
		
		System.out.println(myDog.furColor);
		System.out.println(myCat.furColor);
		
		//myDog.fetchBall();
		//myCat.sleep(); //Since this is an Animal object, it can't access the Cat class methods directly
					     //See below for solution to this:
					   
		myCat.doSomething();
		myDog.doSomething(); //Since we didn't specify a doSomething() method in the Dog class,
							 //it will use the Animal class' default doSomething() method. 
	}

}
