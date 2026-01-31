//Check whether a character is uppercase.

import java.util.Scanner;

public class Character3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Character: ");
		char ch = sc.next().charAt(0);
		
		
		if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase character");
        } else {
            System.out.println(ch + " is not an uppercase character");
        }
	}
}