/*
 * Reverse a string using recursion
 */

public class ReverseString {

	// String instance variable
	String reverse = "";
	
	// Reverse method
	public String reverseString(String str) {
		// If string has 1 character
		if (str.length() == 1) {
			return str;
		} else {
			// Add the last character of the string to the reverse string
			reverse += str.charAt(str.length()-1) +
			// Call the reverse method with the string from 0 to the penultimate character (inclusive), ignoring the character previously added
			reverseString(str.substring(0,str.length()-1));
			return reverse;
		}
	}
	
	// Main
	public static void main (String[] args) {
		ReverseString r = new ReverseString();
		System.out.println(r.reverseString("Joel"));
	}
	
}

// Joel
// Get character at index length-1