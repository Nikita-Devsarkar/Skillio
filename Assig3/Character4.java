//Check whether a character is lowercase.

import java.util.Scanner;

public class Character4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Character: ");
		char ch = sc.next().charAt(0);
		
		
		if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is an lowercase character");
        } else {
            System.out.println(ch + " is not an lowercase character");
        }
	}
}