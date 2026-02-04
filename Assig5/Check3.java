//Check whether number is divisible by 2, 3, or 5.

import java.util.Scanner;

public class Check3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is divisible by 2");
		} else if (num % 3 == 0) {
			System.out.println(num + " is divisible by 3");
		} else if (num % 5 == 0) {
			System.out.println(num + " is divisible by 5");
		} else {
			System.out.println(num + " is not divisible by 2, 3, 5");
		}
	}
}