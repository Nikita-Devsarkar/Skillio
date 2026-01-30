//5.	Write a Java program to calculate simple interest using variables.

public class Simple{
	public static void main(String[] args){
		double Principle = 10;
		double Rate = 20;
		double Time = 30;
		
		double Simple = (Principle * Rate * Time) / 100;
		
		System.out.println("Simple Intrest:" + Simple);
	}
}