//Write a Java program to convert days into years, weeks, and days using variables.

public class Day{
	public static void main(String[] args){
		int day = 735;
		
		int year = day/365;
		int remdays = day%365;
		
		int remweek = remdays/7;
		int days = remdays%7;
	
		
		System.out.println("Week in day: " + remweek);
		System.out.println("Year in day: " +year);
		System.out.println(" days: " +days);
		
	}
}