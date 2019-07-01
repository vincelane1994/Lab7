import java.util.Scanner;

public class Lab7 {
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean validEmail = validateEmail(scnr, "Please enter a valid email: ");
		boolean validName = validateName(scnr, "Please enter a valid Name: ");
		boolean validPhoneNum = validatePhoneNum(scnr, "Please enter a valid phone number: ");
		boolean validDOB = validateDOB(scnr, "Please enter a valid date of birth: ");
		
	}
	

	private static boolean validateEmail(Scanner scnr, String prompt) {
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
	private static boolean validateName(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		do {
			System.out.print(prompt);
			input = scnr.nextLine();
			
			if (input.matches("[A-Z][a-zA-Z]{1,30}")) {
				isValid = true;
				System.out.println("Thank you!");
			} else {
				System.out.println("Input must match the appropriate format.");
				isValid = false;
			}
			
		} while (!isValid);
		return isValid;
	}
	private static boolean validatePhoneNum(Scanner scnr, String prompt) {
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
	private static boolean validateDOB(Scanner scnr, String prompt) {
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
}
