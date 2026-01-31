//Check whether a number is between 1 and 100

import java.util.Scanner;

public class Checknum3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num: ");
		int num = sc.nextInt();

		if (num > 1 && num < 100) {
			System.out.println("Number in between 1 and 100: " + num);
		} else {
			System.out.println("Number is not between 1 and 100: " + num);
		}
	}
}
