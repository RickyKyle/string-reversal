package stringreversal;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {

		// Create an instance of the scanner class. 
		Scanner scanner = new Scanner(System.in);
		
		// Create and initialise a variable to store the string.
		String stringToReverse = "";
		
		// Prompt the user for a string.
		System.out.println("Enter a string to be reversed:");
		
		// Store the next line input by the user.
		stringToReverse = scanner.nextLine();
		
		// Turn the user's input String to a charArray.
		char[] stringToReverseArray = stringToReverse.toCharArray();

		// Iterate backwards through the charArray and output each char. 
		for (int arrayPosition = stringToReverseArray.length - 1; 
				arrayPosition >= 0; arrayPosition--) {

			System.out.print(stringToReverseArray[arrayPosition]);

		}
		
		scanner.close();

	}

}
