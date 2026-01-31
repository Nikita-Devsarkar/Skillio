//Check whether a number is equal to 25.

import java.util.Scanner;

public class Equal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num: ");
		int num = sc.nextInt();

		if (num == 25) {
			System.out.println("Number is equal to 25: " + num);
		} else {
			System.out.println("Number is not equal to 25: " + num);
		}
	}
}