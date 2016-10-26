package inheritance;

//Remember you can't actually define any data here / any implementation, just what the interface looks like
//ie. The method signitues define the minimum requirements for something to be "considered an animal", 
//but does not define the specifics of those requirements
public interface IAnimal {
	
	public void makeNoise();	//method signitures?
	public void doSomething();
	
	public void awaken();
	public void putToBed();
	
	public boolean isAwake();

	//IMPORTANT: MAKE DEFAULT "ANIMAL" CLASS THAT SETS DEFAULT IMPLEMENTATION FOR THESE METHODS, 
	//AND USE OBJECTS TO IMPLEMENT THE DEFAULT CLASS WHEN NEEDED?
	
	//AND WHEN YOU WANT A SPECIFIC METHOD TO RUN FOR THE CLASS (RATHER THAN THE DEFAULT), DEFINE 
	//IT IN THE CHILD CLASS (EG. Dog)
}
