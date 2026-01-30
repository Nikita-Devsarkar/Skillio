//13.	Write a Java program to demonstrate local, instance, and static variables.

public class Demostrate{
	int x = 10;                       // instance variable
	static int y = 20;                  // static variable
	
	public static void main(String[] args){
		int z = 40;                // local variable
		
		Demostrate ds = new Demostrate();
		System.out.println("Instance variable: " + ds.x);
		System.out.println("Static variable: " + y);
		System.out.println("local variable: " + z);
		
	}
}