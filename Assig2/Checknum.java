//11.	Write a Java program to check whether a number is positive, negative, or zero using variables.

public class Checknum{
	public static void main(String[] args){
		int num = -12;
		
		if(num > 0){
			System.out.println("Is a Positive number:" +num);
		}else if(num < 0){
			System.out.println("Is a negative number:" +num);
		}else{
			System.out.println("zero number:" +num);
		}
		
	}
}