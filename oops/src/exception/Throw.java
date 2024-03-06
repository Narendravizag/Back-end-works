package exception;
import java.util.Scanner;

public class Throw {
	static void narendra(int age) {
		if (age < 21)
			try {
				throw new Exception();

			} catch (Exception e) {
				System.out.println("He is not Eligible to married");
			}
		else {
			System.out.println("He is eligible to marriage");
		}
	}

	public static void main(String[] args) {
	narendra(22);
	narendra(15);
	}
}

