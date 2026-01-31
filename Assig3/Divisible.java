
//Check whether a number is divisible by 5 & 11 & 7
import java.util.Scanner;

public class Divisible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num: ");
		int num = sc.nextInt();

		if (num % 5 == 0) {
			System.out.println("Number Is Divisible By 5: " + num);
		} else {
			System.out.println("Number Is Not Divisible By 5: " + num);
		}

		if (num % 11 == 0) {
			System.out.println("Number Is Divisible By 11: " + num);
		} else {
			System.out.println("Number Is Not Divisible By 11: " + num);
		}

		if (num % 7 == 0) {
			System.out.println("Number Is Divisible By 7: " + num);
		} else {
			System.out.println("Number Is Not Divisible By 7: " + num);
		}
	}
}
