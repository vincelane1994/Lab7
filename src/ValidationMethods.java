import java.util.Scanner;

public class ValidationMethods {
	public static boolean validateEmail(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		do {
			System.out.print(prompt);
			input = scnr.nextLine();
			
			if (input.matches("[a-zA-Z\\d]{5,30}[@][a-zA-Z0-9]{5,10}.com")) {
				isValid = true;
				System.out.println("Thank you!");
			} else {
				System.out.println("Input must match the appropriate format.");
				isValid = false;
			}
			
		} while (!isValid);
		return isValid;
	}
	public static boolean validateName(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		do {
			System.out.print(prompt);
			input = scnr.nextLine();
			
			if (input.matches("[A-Z][a-zA-Z]{1,29}")) {
				isValid = true;
				System.out.println("Thank you!");
			} else {
				System.out.println("Input must match the appropriate format.");
				isValid = false;
			}
			
		} while (!isValid);
		return isValid;
	}
	public static boolean validatePhoneNum(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		do {
			System.out.print(prompt);
			input = scnr.nextLine();
			
			if (input.matches("\\d{3}-\\d{3}-\\d{4}")) {
				isValid = true;
				System.out.println("Thank you!");
			} else {
				System.out.println("Input must match the appropriate format.");
				isValid = false;
			}
			
		} while (!isValid);
		return isValid;
	}
	public static boolean validateDOB(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		do {
			System.out.print(prompt);
			input = scnr.nextLine();
			
			if (input.matches("\\d{2}[/]\\d{2}[/]\\d{4}")) {
				isValid = true;
				System.out.println("Thank you!");
			} else {
				System.out.println("Input must match the appropriate format.");
				isValid = false;
			}
			
		} while (!isValid);
		return isValid;
	}
	public static boolean validateHTML(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		do {
			System.out.print(prompt);
			input = scnr.nextLine();
			
			if (input.matches("[<][a-zA-z0-9]+[>] [<][/][a-zA-z0-9]+[>]")) {
				isValid = true;
				System.out.println("Thank you!");
			} else {
				System.out.println("Input must match the appropriate format.");
				isValid = false;
			}
			
		} while (!isValid);
		return isValid;
	}
}
