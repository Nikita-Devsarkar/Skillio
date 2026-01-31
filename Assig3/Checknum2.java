//Check whether a number is positive, negative, or zero

import java.util.Scanner;

public class Checknum2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num: ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("It Is Positive Number: " + num);
		} else if (num == 0) {
			System.out.println("It Is  Zero Number: " + num);
		} else {
			System.out.println("It Is  Negative Number: " + num);
		}
	}
}
