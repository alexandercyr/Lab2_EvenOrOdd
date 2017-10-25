import java.util.Scanner;

public class EvenOrOdd {

	public static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {

		int number = 0;
		String continueRun = "y";
		
		while (continueRun.equalsIgnoreCase("y")) {
			System.out.print("Enter a number between 1 and 100: ");
			number = validateInput();

			if (number < 25) {
				if (isEven(number)) {
					System.out.println("Even and less than 25");
				} 
				else {
					System.out.println(number + " and Odd");
				}

			} 
			else if (number > 60) {
				if (!isEven(number)) {
					System.out.println("Odd and greater than 60");
				} 
				else {
					System.out.println(number + " and Even");
				}
			} 
			else {
				if (isEven(number)) {
					System.out.println(number + " and Even");
				} 
				else {
					System.out.println(number + " and Odd");
				}
			}
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

			while (!scnr.hasNextInt()) {
				System.out.print("Invalid entry. Enter a number between 1 and 100: ");
				scnr.nextLine();
			}

			number = scnr.nextInt();

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
		boolean even = false;

		if (number % 2 == 0) {
			even = true;
		}

		return even;
	}

}
