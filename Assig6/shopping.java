//Online shopping system using if-else
import java.util.Scanner;

public class shopping{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 for shirt/2 for pant/3 for top/4 for watch");
		
		System.out.print("Select product: ");
            int choice = sc.nextInt();

            int price = 0;

            if (choice == 1) {
                price = 1000;
            } 
            else if (choice == 2) {
                price = 2000;
            } 
            else if (choice == 3) {
                price = 500;
            } 
			else if (choice == 4) {
                price = 3000;
            } 
            else {
                System.out.println("Invalid Product!");
            }
			
			System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            int totprice = price * qty;
			 System.out.println("Final Amount: Rs." + totprice);
			
			System.out.println("Select Payment Method:");
            System.out.println("1. Cash on Delivery");
            System.out.println("2. UPI");
            int payment = sc.nextInt();

            if (payment == 1) {
                System.out.println("Order placed with Cash on Delivery");
            } 
            else if (payment == 2) {
                System.out.println("Payment Successful by UPI");
            } 
            else {
                System.out.println("Invalid Payment Option");
            }
		
	}
}