//Check whether a character is special symbol.

import java.util.Scanner;

public class CheckCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Character:");
		char ch = sc.next().charAt(0);

		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
			System.out.println(ch + " character is not special symbol");
		} else {
			System.out.println(ch + " character is special symbol");
		}
	}
}