package samplePrograms.String;

public class StrReFu {

	public static void main(String[] args) {

		String stringExample = "Kalpesh Ahirrao";

		System.out.println("Original string: " + stringExample.replace(" ", ""));

		// Declaring a StringBuilder and converting string to StringBuilder

		StringBuilder reverseString = new StringBuilder(stringExample);

		reverseString.reverse(); // Reversing the StringBuilder

		// Converting StringBuilder to String

		String result = reverseString.toString();

		System.out.println("Reversed string: " + result.replace(" ", "")); // Printing the reversed String

	}

}
