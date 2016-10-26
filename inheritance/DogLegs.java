package inheritance;

public class DogLegs
{
	int availableSteps = 0;
	
	public void feed (int treats)
	{
		availableSteps += treats;
	}
	
	public void takeStep()
	{
		availableSteps--;
	}
	
	public boolean isHungry()
	{
		return availableSteps > 0;
	}
}
