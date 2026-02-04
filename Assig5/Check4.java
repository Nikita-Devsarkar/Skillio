//Check whether number is divisible by 4 or 6.

import java.util.Scanner;

public class Check4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		
		if (num % 4 == 0 || num % 6 == 0) {
            System.out.println("The number is divisible by 4 or 6.");
        } else {
            System.out.println("The number is not divisible by 4 or 6.");
        }
	}
}