//Check whether a number is divisible by 2 and 3.

import java.util.Scanner;

public class Divisible1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Number Is Divisible By 2: " + num);
		} else if (num % 3 == 0) {
			System.out.println("Number Is Divisible By 3: " + num);
		} else {
			System.out.println("Number Is Not Divisible By 2 & 3: " + num);
		}

	}
}