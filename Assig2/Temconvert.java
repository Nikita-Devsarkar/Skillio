//7.	Write a Java program to convert temperature from Celsius to Fahrenheit using variables

public class Temconvert{
	public static void main(String[] args){
		double celsius = 25;
		double fahrenheit;
		
		fahrenheit = (celsius * 9 / 5) + 32;
		System.out.println("Tem in fahrenheit:" + fahrenheit);
	}
}