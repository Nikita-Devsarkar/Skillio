// Check whether a number is less than 50.

import java.util.Scanner;

public class Numcheck1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num: ");
		int num = sc.nextInt();

		if (num < 50) {
			System.out.println("Number is less Than 50: " + num);
		} else {
			System.out.println("Number is greater Than 50: " + num);
		}
	}
}
