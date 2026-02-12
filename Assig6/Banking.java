//Banking transaction system.
import java.util.Scanner;

public class Banking{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for check_balance/2 for deposit/3 for withdraw/4 for transfer/5 for Exit");
		int choice = sc.nextInt();
		int balance = 1000;
		
		if(choice==1){
			System.out.println("balance:"+balance);
		}else if(choice ==2){
			System.out.println("Enter Amount to deposit:");
			int deposit = sc.nextInt();
			balance = balance + deposit;
			System.out.println("Amount Deposited Successfully");
			System.out.println("updated Balance:"+balance);
		}else if(choice == 3){
			System.out.println("Enter Amount to withdraw:");
			int withdraw = sc.nextInt();
			
			if(withdraw <= balance){
				balance= balance-withdraw;
				System.out.println("collect your cash");
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
		}else if(choice == 4){
			System.out.println("Enter transfer Amount:");
			int transamount = sc.nextInt();
			
			if(transamount <= balance){
				balance= balance-transamount;
				System.out.println("transfer amount successfully");
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
		}else if(choice ==5){
			System.out.println("Exit");
		}else{
			System.out.println("Invalid choice");
		}
	}
}