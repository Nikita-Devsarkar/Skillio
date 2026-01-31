//Check whether a year is a leap year.

import java.util.Scanner;

public class Leapyear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Year: ");
		int year = sc.nextInt();
		
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is a not leap year");
        }
	}
}