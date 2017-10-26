import java.util.Scanner;

/**
 *	Program prompts user for a number between 1 and 100 and
 *	determines if the give item is even or odd.
 *
 *	@author Alexander Cyr
 *
 */

public class EvenOrOdd {

	public static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {

		int number = 0;
		String continueRun = "y";
		
		//Loop to continue program until users quits
		while (continueRun.equalsIgnoreCase("y")) {
			System.out.print("Enter a number between 1 and 100: ");
			number = validateInput();

			//When user input is less than 25, print if number is even or odd
			if (number < 25) {
				if (isEven(number)) {
					System.out.println("Even and less than 25");
				} 
				else {
					System.out.println(number + " and Odd");
				}

			} 
			
			//When user input is greater than 60, print even or odd
			else if (number > 60) {
				if (!isEven(number)) {
					System.out.println("Odd and greater than 60");
				} 
				else {
					System.out.println(number + " and Even");
				}
			} 
			
			//Default print even or odd for numbers between 25 and 60
			else {
				if (isEven(number)) {
					System.out.println(number + " and Even");
				} 
				else {
					System.out.println(number + " and Odd");
				}
			}
			
			//Prompt user if they want to continue using the program
			scnr.nextLine();
			System.out.println("Continue? (y/n)");
			continueRun = scnr.nextLine();
		}
		System.out.println("Program terminated.");
		scnr.close();

	}

	public static int validateInput() {
		int number = 0;
		boolean valid = false;

		while (!valid) {

			//If user input is not an int, ask user to try again
			while (!scnr.hasNextInt()) {
				System.out.print("Invalid entry. Enter a number between 1 and 100: ");
				scnr.nextLine();
			}

			number = scnr.nextInt();
			
			//Check to see if the entered number is within 0 and 100
			if (number > 0 && number <= 100) {
				valid = true;
			} else {
				System.out.print("Invalid entry. Enter a number between 1 and 100: ");
				scnr.nextLine();
			}
		}

		return number;

	}

	public static boolean isEven(int number) {
		//returns true if user input is even
		return (number % 2 == 0);
	}

}
