package lessonExamples;

	//this is the Class Car.  it consists of
	//the Class VARIABLES (describes variables which define a given Car Class instance)

	//the Class CONSTRUCTOR (Creates a new instance of the Car class)

	//the Class METHODS (performs actions on a given instance of the Car class)

	//the MAIN METHOD (All java applications begin with processing a main() method.   Each statement in the main() method is executed
	//in order until the end is reached. When end is reached program terminates.

	//public is a Java keyword which declares a member's access as public. Public
	//members are visible to all other classes. This means that any other class can access 
	//a public field or method. Further, other classes can modify public fields unless the 
	//field is declared as final .

	//private is a Java keyword which declares a member's access as private.
	//outer classes cannot be private (Car is considered an outer class).
	//Class members (variables, methods, constructors and inner classes that are part
    //of a class) can be private.
	//That means, the member is only visible within the class, not from any other class 
	//(including subclasses). The visibility of private members extends to nested classes.
	// In Object Oriented Programming we use this methodology to "encapsulate" the details
	// of how a class operates so that it can be more easily coupled to other elements of code


public class Car {
	//Below are the Car class VARIABLES;
	
    private int yearModel;
    private String make;
    private int speed;
    
    // Below is the CONSTRUCTOR.  It creates a single instance of the class Car
    // The constructor accepts the car's year model and make as argument
    // The constructor assigns 0 to the speed field
    public Car (int yrModel, String carMake){
    	yearModel = yrModel;
        make = carMake;
        speed = 0;
        }
    // Below are METHODS to operate on instances of class CAR
    public void setyearModel(int yrModel){
        yearModel = yrModel;
        }
    public void setMake (String carMake){
        make = carMake;
        }
    public void setSpeed(int carSpeed){
        speed = carSpeed;
        } 
    public int getYearModel(){
        return yearModel;
        }
    public String getMake (){
        return make;
        }
    public int getSpeed (){
        return speed;
        }
    public void AccelerateSpeed (int speed){
        speed = speed + 5;
        }
    public void BrakeSpeed (int speed){
        speed = speed - 5;
        }
    
    
    // Below is the MAIN METHOD.  This method runs all code within its { & } brackets and is what is called when you run the program
    public static void main(String [ ] args){
    	
    	// We will create an Array called myCars to store our Car objects in.  There will be 10 slots;
    	Car[] myCars=new Car[5];
    	
    	// We will create an 4 car Objects and store them in the 5 slots of myCars;
	    myCars[0]=new Car (1989, "Ford");	
	    myCars[1]=new Car (1999, "Honda");	
	    myCars[2]=new Car (2003, "Toyota");
	    myCars[3]=new Car (2003, "Toyota");
	    
	    // we can count how many objects our cars array CAN hold;
	    int cars =myCars.length;
	    System.out.println("We have room for "+cars +" cars");
	    
	    // below we have a FOR LOOP statement, describing the cars stored in myCars array;
	    int carNumber=0;
	    for(Car a:myCars){
	    	if(a!=null){
	    		carNumber=carNumber+1;
	    		System.out.println("Car Number "+carNumber+" is a "+a.make+" "+a.yearModel);
	    	}
	    } 
     
    }    
  
}
