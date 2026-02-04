//Check whether a number lies in a given range.
import java.util.Scanner;

public class NumberRange{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Lower range:");
		int Low = sc.nextInt();
		
		System.out.println("Enter the Higher range:");
		int high = sc.nextInt();
		
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		if(num >= Low && num <= high){
				System.out.println(num+ " lies in a range");
		}else{
				System.out.println(num + " not lies in a range");
		}
	}
}