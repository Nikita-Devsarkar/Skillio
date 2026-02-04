//Check whether input is positive and even.
import java.util.Scanner;

public class Check{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		
		if(num >= 0 && num%2 == 0){
			System.out.println("Input is positive and even");
		}else{
			System.out.println("Input is not positive and even");
		}
	}
}