/* Student Name: Jennifer Tran
 * Lab Professor: Mohammed Patoary
 * Due Date: November 19,2021
 * Description: This User class will hold the Scanner class for the inputs of numbers/ strings of the user. 
 */

import java.util.Scanner;

/* This is the start of the User class which will hold the Scanner class for inputs regarding integers, doubles and strings */

public class User {
	
	private Scanner keyboard = new Scanner(System.in);
	
	/* This method calls inputInterger.Will allow the user to enter only numbers
	 * Using a while loop, If the user entered other than a number it will output "Invalid input. Enter a number" until a number has been entered*/
	public int inputInteger() {
		
		while(!keyboard.hasNextInt()) {
			keyboard.nextLine();
			System.out.println("Invalid input. Enter a number: ");
		}
		
		int value = keyboard.nextInt();
		keyboard.nextLine();
		return value;
	}
	
	
	
	 /* This method calls inputInteger(), numbers*/
	public int inputInteger(String message) {
		System.out.printf("%s", message);
		int value = inputInteger(); 
		return value;
	}
	
    /*This method calls inputDouble() .Will allow the user to enter only numbers
	 * Using a while loop, If the user entered other than a number it will output "Invalid input. Enter a number" until a number has been entered*/ 
	public double inputDouble() {
		while(!keyboard.hasNextDouble()) {
			System.out.println("Invalid input. Enter a number: ");
			keyboard.nextLine();
		}
		double value = keyboard.nextDouble();
		keyboard.nextLine();
		return value;	
	}
	
	/* This method calls inputDouble(), numbers */ 
	public double inputDouble(String message) {
		
		System.out.printf("%s", message);
		double value = inputDouble();
		return value;
	}
	
	/* This method calls inputString(), text */ 
	public String inputString() {
		String value = keyboard.nextLine();
		return value;
	}
	
	/* This method calls inputString(), text*/ 
	public String inputString(String message) {
		System.out.printf("%s", message);
		String value = inputString();
		return value;
	}
}