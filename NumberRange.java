
//Check whether a number lies in a given range.
import java.util.Scanner;

public class NumberRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the range:");
		int range = sc.nextInt();

		System.out.println("Enter the number:");
		int num = sc.nextInt();

		if (range == num) {
			System.out.println(num + "lies in a range");
		} else {
			System.out.println(num + "not lies in a range");
		}
	}
}