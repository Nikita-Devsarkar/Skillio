//12.	Write a Java program to calculate the total and percentage of 5 subjects using variables.

public class Totalper{
	public static void main(String[] args){
		int math = 65;
		int oops = 75;
		int phy = 60;
		int chem = 55;
		int spm = 70;

		int total = math + oops + phy + chem + spm;
		double percentage = (total / 500.0) * 100;
		
		System.out.println("Total Mark: " +total );
		System.out.println("percentage: "+percentage + "%");
	}
}