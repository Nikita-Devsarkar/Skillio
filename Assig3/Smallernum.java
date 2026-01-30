//Find the smaller of two numbers.

import java.util.Scanner;

public class Smallernum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of x: ");
		int x = sc.nextInt();
		System.out.println("Enter the value of y: ");
		int y = sc.nextInt();
		
		if(x < y){
			System.out.println("X is Smaller number: "+x);
		}else{
			System.out.println("Y is Smaller number: "+y);
		}
	}
}
