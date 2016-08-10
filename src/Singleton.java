/*
 * Create a Singleton class
 */


public class Singleton {
	
	// Singleton object
	private static Singleton myObj;
	
	// Static block
	static {
		// Initialize myObj instance variable
		myObj = new Singleton();
	}
	
	// Private constructor to stop instantiation
	private Singleton(){}
	
	// Get instance method
	public static Singleton getInstance() {
		return myObj;
	}
	
	// Test method
	public void testMe() {
		System.out.println("Singleton class works!");
	}
	
}
