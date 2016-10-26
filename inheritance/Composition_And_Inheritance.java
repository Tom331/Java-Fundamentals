package inheritance;
/*First note: ALWAYS FAVOR COMPOSITION...WHY?
	1) Because John Sonmez said so
	2) Does Is-A relationships really HAVE to be implemented with inheritance?
		-There are ways to re-write Is-A relationships to make it a Has-A
		-You can say that same 'Is-A' relationship Has-a implementation of something
		-You can favor composition by using interfaces
		
	3) Mainly, because a class CAN NOT inherit from more than one parent class.
	   eg) you can't say: public class Bird extends Animal, Flyable
	   
	   BUT a class CAN implement more than one interface
	   eg) you can say: public class Bird implements IAnimal, IFlyable
*/


/*
 ~~~~~~~~~~~~~~INHERITANCE~~~~~~~~~~~~~~~~~~~~~Oct. 18, 2016
 
 An interface is essentially inheritance without all the "baggage"/without all the "bad stuff":
 	-No implementation details: An interface just specifies what the method signitures are for a class
 	 that's implementing that interface
 	 -a method signiture is the name and parameter types of a method. Eg)calculateAnswer(double, int, double, double)
 	
 	 -When we used inheritance and had our Animal class, we may have had our Animal class have some
 	  default behaviour [ ie) doSomething() and makeNoise() ]. With an interface we may still have
 	  all of those methods but we are not providing any default implementation. We force you to provide
 	  these implementations yourself. 
 	  
 	 -What we get from this is that we can have multiple implementations. We can implement multiple
 	  interfaces. eg) A Cat class could be an Animal interface, a Mammal interface and/or a Furry
 	  interface. But you can only inherit from "ONE OBJECT" / "ONE CLASS". Eg) Cat can only inherit
 	  from Animal OR Mammal OR Furry, but not more than one. 
 	  
 	 -Interfaces work with polymorphism which allows us to change the Is-A (Inheritance) relationship
 	  to a Has-A (Composition) relationship. We will use the interface as a substitute for a base class/
 	  parent class.
 	  
 	  -Basically, an Interface is the definition of what methods need to be impleneted by some class
 	  
 	  -to know what an interface is, start the interface name with an I. Eg) IAnimal
 	  
 	  -The child classes are going to implement the parent class. Eg) Dog and Cat will implement
 	   IAnimal. It's just like inheritance except they're not getting the methods, they're just 
 	   getting the requirements to implement those methods. 
 	   
 	   -The trick to change inheritance into composition is to have a child class that acts
 	    as a default for the other child classes. Then you can put all of the default behaviour
 	    inside there. Eg) DefaultAnimal. Then the other child classes can call methods from
 	    that DefaultAnimal class, such as DefaultAnimal.eat(). 
 
 */



/*Is-A and Has-A relationships define whether inheritance or composition will be used
-Classes are often going to be related by an Is-A or Has-A relationship
	-A cat Is-A Animal
	-A car Has-A engine and wheels
	
	-Is-A relationship = Inheritance (it INHERITS characteristics from...it's a sub-type)
	-Has-A relationship = Composition (it's COMPOSED of these other types)
	
	-This all comes from a need to be able to reuse code
	
	-With inheritance you have to make sure the sub-type can be substituted anywhere the base type is used
		-For example, if you have an Animal class and a Cat sub-class, the Cat sub-class should be able
		to be used anywhere the Animal class is used or else it's not modeled properly with an
		inheritance relationship
		
	-"extends" keyword implies inheritance:
		-eg)Public Class Printer extends Machine //because a Printer Is-A machine
		
		
	-Composition: Something is made up of some other parts
	-used by creating a class of one of the parts the parent class is composed of, and then creating
	an object of that 'part' class in the parent class. 
	-eg)
	
public class PaperTray
{
	int pages = 0;
	
	public void addPaper(int count)
	{
		pages += count;
	}
	
	public void usePage()
	{
		pages--;
	}
	
	public boolean isEmpty()
	{
		return pages > 0;
	}
}

	-And in the parent class:

public class Printer extends Machine
{
	private PaperTray paperTray = new PaperTray();
	
	...
}
	

*/
public class Composition_And_Inheritance {

}
