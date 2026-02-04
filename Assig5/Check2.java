//Check whether input is negative and odd.

import java.util.Scanner;

public class Check2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		
		if(num < 0 && num%2 != 0){
			System.out.println("Input is negative and odd");
		}else{
			System.out.println("Input is not negative and odd");
		}
	}
}