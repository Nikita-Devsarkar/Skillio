//Check whether three numbers are equal.

import java.util.Scanner;

public class CheckNum3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number1:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the number2:");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the number3:");
		int num3 = sc.nextInt();
		
		if(num1 == num2 && num1 == num3){
				System.out.println("three number are equal");
		}else{
				System.out.println("three number are not equal");
		}
	}
}