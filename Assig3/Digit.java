//Check whether a character is a digit.

import java.util.Scanner;

public class Digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Digit: ");
		int digit = sc.nextInt();

		if (digit >= 0 && digit <= 9) {
			System.out.println(digit + " is an digit");
		} else {
			System.out.println(digit + " is not digit");
		}
	}
}
