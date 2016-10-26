package polymorphismCatDog;

public class Dog extends Animal{ //this is inheritance... it means Dog inherits from Animal
	
	public Dog(String furColor)
	{
		super(furColor);
	}
	
//  COMMENTING THIS OUT WILL RESULT IN AN ANIMAL OBJECT OF TYPE DOG TO USE THE ANIMAL doSomething() method
//	public void doSomething()
//	{
//		System.out.println("Dog is fetching the ball");
//	}
	
	@Override
	public void makeNoise()
	{
		System.out.println("Woof!");
	}
	
	//example of how Animal object can't reference Dog class, even if the Animal object is of type Dog:
	public void fetchBall()
	{
		System.out.println("Dog is fetching the ball");
	}
	
	
	
	
	


}
