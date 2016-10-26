package inheritance;

public class Dog implements IAnimal{ //Dog "gets requirements of an Animal from" IAnimal
									 //ie) To be considered a Dog, it has to meet the requirements
								     //specified in IAnimal
	
	private DogLegs dogLegs = new DogLegs(); //replacement of John's PaperTray class
	
	private Animal animal;
	public Dog(boolean isAwake)
	{
		animal = new Animal(isAwake); //Taking the logic of handling isAwake out of the class.
	}
	
	@Override
	public void awaken()
	{
		animal.awaken(); 
		System.out.println("The dog is awake");
	}
	
	@Override
	public void putToBed()
	{
		animal.putToBed();
		System.out.println("The dog is now put to bed...");
	}
	
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

//COMMENTING OUT WILL RESULT IN ANIMAL doSomething() being called:
	@Override
	public void doSomething() {
		System.out.println("The dog is digging a hole");
	}

	@Override
	public boolean isAwake() {
		return animal.isAwake; //delegating our call to Animal
	}

}
