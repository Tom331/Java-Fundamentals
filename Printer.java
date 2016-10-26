
public class Printer extends Machine //A printer Is-A machine...extends implies inheritance
{
	private String modelNumber;
	private PaperTray paperTray = new PaperTray();
	
	public Printer(boolean isOn, String modelNumber) //CONSTRUCTOR 
	{
		super(isOn); // call constructor of Machine class...super = "call my parent"
					 //  or "call who I'm inheriting from" 
					 // just like "this" refers to the current class that we're using, 
					 // super refers to the current parent we're using
		
		this.modelNumber = modelNumber; //"this" means you're talking about the class level variable. 
										//NOT the method level variable
								 	    //So here you are assigning the class level variable
										//the value that is passed into this constructor
										//by the "String modelNumber" parameter
	}
}
