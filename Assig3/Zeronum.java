//Check whether a number is zero or not.

import java.util.Scanner;

public class Zeronum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num: ");
		int num = sc.nextInt();
		
		
		if(num == 0){
			System.out.println("Zero Number: "+num);
		}else{
			System.out.println("Not Zero Number: "+num);
		}
	}
}
