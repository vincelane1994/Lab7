import java.util.Scanner;

import pigLatin.ValidationMethods;

public class Lab7 {
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean validEmail = ValidationMethods.validateEmail(scnr, "Please enter a valid email: ");
		boolean validName = ValidationMethods.validateName(scnr, "Please enter a valid Name: ");
		boolean validPhoneNum = ValidationMethods.validatePhoneNum(scnr, "Please enter a valid phone number 000-000-0000: ");
		boolean validDOB = ValidationMethods.validateDOB(scnr, "Please enter a valid date of birth dd/mm/yyyy: ");
		boolean validHTML = ValidationMethods.validateHTML(scnr,  "Please enter a valid HTML expression");
		if(validEmail && validName && validPhoneNum && validDOB && validHTML) {
			System.out.println("Looks like everything works. Have a nice day!");
		}
		
		
	}
}
