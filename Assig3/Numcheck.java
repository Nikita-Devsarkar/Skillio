//Check whether a number is greater than 100.

import java.util.Scanner;

public class Numcheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num: ");
		int num = sc.nextInt();

		if (num > 100) {
			System.out.println("Number is greater Than 100: " + num);
		} else {
			System.out.println("Number is smaller Than 100: " + num);
		}
	}
}
