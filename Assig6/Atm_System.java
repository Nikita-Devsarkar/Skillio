//Simple ATM system using if-else.
import java.util.Scanner;

public class Atm_System{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int balance = 8000;
        int choice, deposit, withdraw;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
		
		if(choice == 1){
			System.out.println("Your Balance is: " + balance);
		}
		else if(choice == 2){
			System.out.print("Enter amount to deposit: ");
            deposit = sc.nextInt();
            balance = balance + deposit;
            System.out.println("Amount Deposited Successfully");
            System.out.println("Updated Balance: " + balance);
		} 
		else if(choice == 3){
			System.out.print("Enter amount to withdraw: ");
            withdraw = sc.nextInt();

            if (withdraw <= balance) {
                balance = balance - withdraw;
                System.out.println("collect your cash");
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
        } 
        else if (choice == 4) {
            System.out.println("Exit to ATM.");
        } 
        else {
            System.out.println("Invalid Choice!");
        }
	}
}