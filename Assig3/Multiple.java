//Check whether a number is a multiple of 3.
//Check whether a number is a multiple of 10.

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num: ");
		int num = sc.nextInt();

		if (num % 3 == 0) {
			System.out.println("Number Is Multiple of 3: " + num);
		} else {
			System.out.println("Number Is Not Multiple of 3: " + num);
		}

		if (num % 10 == 0) {
			System.out.println("Number Is Multiple of 10: " + num);
		} else {
			System.out.println("Number Is Not Multiple of 10: " + num);
		}
	}
}
