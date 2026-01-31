//Check whether a character is a consonant.

import java.util.Scanner;

public class Character2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Character: ");
		char ch = sc.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("character is vowel: " + ch);
		} else {
			System.out.println("character is consonant: " + ch);
		}
	}
}