package constructor;

public class ConstructorCall {
	public static void main(String[] args) {
		
//coords: x, y //width, height: width, height... in that order
		
		
		Constructor firstCon = new Constructor(); /*coords, width, height are all set by the class
												  level variables in the Constructor class
												  */
												  
		
		Constructor secondCon = new Constructor(15, 10); /*
		 												   Width, height set by this object's arguments,
		 												   Coords set by the class level variables in Constructor*/
		
		Constructor thirdCon = new Constructor (50, 50, 50, 40); /*all variables set by this object's params*/
		
		
		firstCon.printVariables();
		
		secondCon.printVariables();
		
		thirdCon.printVariables();
		
	}

}
