package keywords;

public class ChildKeywords extends ParentKeywords {

	int id =76; // variables
	String Name = "Kamal";
	
	public void preparing() { //method
		System.out.println("Students are preparing for exam");
	}
	
	public ChildKeywords() { //constructor 
		System.out.println("Current class constructor");
}
	
	
	/**
	 * Super keyword can be used to invoke parent class variables,methods and constructors
	 */
	
	public void checkingSuper() {
		System.out.println("parent class id == " + super.id); // invoking parent class variables
		System.out.println("parent class name == " + super.Name);
		
		super.test1(); // invoking parent class method
	}
	
		
	/**
	 * This Keyword can be used to invoke current class variables,methods and constructors
	 */
	
	public void checkingThis() {
		
		System.out.println("Current class id == " + this.id); // invoking current class variables
		System.out.println("Current class name == " + this.Name);
		
		this.preparing(); // invoking current class methods
		}
	
	public ChildKeywords(String college) { // invoking current class constructor
		this();
		System.out.println("Studying in " + college);
	}
	
	static { // Always prints in the starting of the code
		System.out.println("Prints always in starting of the code");
	}


public static void main(String[] args) {
	ChildKeywords childKeywords = new ChildKeywords();
	childKeywords.checkingSuper();
	childKeywords.checkingThis();
	ChildKeywords childKeywords1 = new ChildKeywords("VIT");
	
	}

}
