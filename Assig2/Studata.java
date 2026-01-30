//10.	Write a Java program to store student details (roll number, name, marks) using variables and display them.

public class Studata{
	int rollno = 10;
	String name = "Nikita";
	int mark = 35;
	
	public static void main(String[] args){
		Studata sd = new Studata();
		
		System.out.println("RollNo: " + sd.rollno);
		System.out.println("Name: " + sd.name);
		System.out.println("Maek: " +sd.mark);
		
		
	}
}