//Find the greater of two numbers.

import java.util.Scanner;

public class Greaternum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of x: ");
		int x = sc.nextInt();
		System.out.println("Enter the value of y: ");
		int y = sc.nextInt();
		
		if(x > y){
			System.out.println("X is greater number: "+x);
		}else{
			System.out.println("Y is greater number: "+y);
		}
	}
}
