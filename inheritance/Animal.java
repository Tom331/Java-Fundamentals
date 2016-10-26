package inheritance;

public class Animal implements IAnimal{
	
	protected boolean isAwake;
	
	public Animal (boolean isAwake)
	{
		this.isAwake = isAwake;
	}
	
	public void makeNoise()
	{
		System.out.println("ASLKDFJASLKDFJASK");
	}
	
	public void doSomething()
	{
		System.out.println("This animal is doing something");
	}

	@Override
	public void awaken() {
		System.out.println("Waking up the animal");
		isAwake = true;
	}

	@Override
	public void putToBed() {
		System.out.println("Putting the animal to bed");
		isAwake = false; 
	}

	@Override
	public boolean isAwake() {
		return isAwake;
	}

}
