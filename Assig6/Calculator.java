//Menu-driven calculator using if-else.
import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter your num2:");
		int num2 = sc.nextInt();
		
		System.out.println("press 1 For addition");
		System.out.println("press 2 For subtraction");
		System.out.println("press 3 For multiplication");
		System.out.println("press 4 For division");
		System.out.println("press 5 For division");
		System.out.println("Enter your choice:");
		int choice =  sc.nextInt();
	
		if(choice == 1){
			System.out.println(num1 +"+"+ num2 +"="+ (num1 + num2));
		}
		else if(choice == 2){
			System.out.println(num1 +"-"+ num2 +"="+ (num1 - num2));
		}
		else if(choice == 3){
			System.out.println(num1 +"*"+ num2 +"="+ (num1 * num2));
		}
		else if(choice == 4){
			System.out.println(num1 +"/"+ num2 +"="+ (num1 / num2));
		}
		else if(choice == 5){
			System.out.println(num1 +"%"+ num2 +"="+ (num1 % num2));
		}
		else{
			System.out.println("invalid Choice");
		}
	}
}