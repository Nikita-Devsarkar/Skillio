//Railway ticket booking system logic.
import java.util.Scanner;

public class Railway{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seats = 50, price = 0;

        System.out.println("1.Sleeper 500  2.AC 1200  3.General 200");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter tickets: ");
        int tickets = sc.nextInt();

        if (tickets <= seats) {

            if (choice == 1){
                price = 500;
			}
            else if (choice == 2){
                price = 1200;
			}
            else if (choice == 3){
                price = 200;
			}
            else {
                System.out.println("Invalid Choice");
            }

            int total = price * tickets;
            System.out.println("Total: Rs." + total);
            System.out.println("Booking Confirmed");

        } else {
            System.out.println("Seats not available");
        }
    }
}
