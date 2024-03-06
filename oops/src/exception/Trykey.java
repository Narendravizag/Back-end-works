package exception;
import java.util.Scanner;

public class Trykey {
	public static void main(String[] args) {

		try {
			Scanner num = new Scanner(System.in);
			System.out.println("Enter the first number=");
			int y = num.nextInt();
			Scanner num1 = new Scanner(System.in);
			System.out.println("Enter the second number=");
			int y1 = num1.nextInt();
			int num2 = y / y1;

			System.out.println("Divided number=" + num2);
			System.out.println("Hey I'm at the end of try block");

		}

		catch (ArithmeticException ex) {

			System.out.println("Can not divide a number by zero");
		}

		catch (Exception e) {

			System.out.println("Exception occurred");
		}
		System.out.println("I'm out of try-catch block in Java.");
	}
}

