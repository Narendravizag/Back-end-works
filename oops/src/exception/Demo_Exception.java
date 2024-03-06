package exception;

import java.util.Scanner;

public class Demo_Exception {

	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int num = scanner.nextInt(); // Try to read an integer from user input
            int result = num/ 10; // Attempt to divide 10 by the entered number
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero .");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
        } finally {
            scanner.close(); // Ensure the scanner is closed regardless of exceptions
        }
		// TODO Auto-generated method stub

	}

}

