package polymorphismCatDog;

public class Cat extends Animal
{
	public Cat(String furColor){
		super(furColor); //Taking the furColor from the Animal class, so both Dog and Cat will be black
	}
	
	@Override
	public void makeNoise()
	{
		System.out.println("Meow!");
	}
	
	public void doSomething()
	{
		System.out.println("Cat is sleeping");
	}
	
	//example of how Animal object can't reference Cat class, even if the Animal object is of type Cat:
	
	public void sleep()
	{
		System.out.println("Cat is sleeping");
	}
}
