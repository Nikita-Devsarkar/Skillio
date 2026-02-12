//Hotel management billing system.
import java.util.Scanner;

public class Hotel_manag{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for single room /2 for double room/ 3 for triple room");
		int choice = sc.nextInt();
		int roomcharge = 0;
		
		if(choice ==1){
			roomcharge = 1000;
		}else if(choice ==2){
			roomcharge = 1500;
		}else if(choice == 3){
			roomcharge = 2000;
		}else{
			System.out.println("invalid choice");
		}
		
		System.out.println("Enter Number of Days:");
		int numberofdays = sc.nextInt();
		
		int roomtotal = (roomcharge * numberofdays);
		
		System.out.println("Enter 1 for foodrequired/2 for not required");
		int choice2 = sc.nextInt();
		int foodCharge;
		
		if(choice2 == 1){
			foodCharge = 500 * numberofdays;
		}else{
			foodCharge=0;
		}
		
		int TotalBill = roomtotal + foodCharge;
		System.out.println("TotalBill:"+TotalBill);
		
		
		
	}
}
