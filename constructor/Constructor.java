package constructor;
/*
- A constructor is an important part of creating a class
-It is "the initialization of that class" or "setting up some initial data of that class"
-We use a constructor to set up our class or CONSTRUCT our object from our class

*/
public class Constructor { 



	//Constructor is now a Rectangle:
		
	//Coordinates of rectangle:
	int x, y;
	
	//Dimensions of rectangle:
	int width, height;
	
	public Constructor()
	{
		this(0, 0, 2, 1);
		
	}
	
	public Constructor (int width, int height)
	{
		this(5,5, width, height);
	}
	
	public Constructor(int x, int y, int width, int height) {
		// TODO Auto-generated constructor stub
	    this.x = x;
	    this.y = y;
	    this.width = width;
	    this.height = height;
	}
		
	public void printVariables(){
		System.out.println(x + "," + y + "," + width + "," + height);	
	}
	
/*
 * ACCESS MODIFIERS: public, private and protected
 * public: Anyone can access it, even from another class
 * private: Only methods from inside the same class can access it
 * protected: Allows children of that class / classes that inherit from that class to access that variable
 * static: The variable belongs to a class, not the instance of a class. For example, if you wanted to add
 * the number of bicycles that have been created to the end of it's serial number you could use:
 * 
 * private static int numOfBikes = o;
 * 
 * and then in a Bike constructor have:
 * 
 * id = ++numOfBikes;
 * 
 * SEE BICYCLE FOR EXAMPLE
 * 
 */

}
