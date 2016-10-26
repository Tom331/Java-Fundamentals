
public class HelloWorld {

	public static void main(String[] args) {
		//Printer myPrinter = new Printer();          -Example of default constructor. Creates an instance 
												//     of the Printer class. Only useable if you 
												//     have NOT created your own constructor

		  Printer myPrinter = new Printer(false, "#AET4007"); //Creates an instance of the Printer class using
		  											   //the constructor I created. This is useful here
		  											   // because ALL printers have a state (on/off) and
		  											   // a model number. And since we initialized this 
		  											   // constructor, new printer objects/instnaces
		  											   // will be forced to have a default state & model#
	}
}
