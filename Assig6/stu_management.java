//Student management system (basic)
import java.util.Scanner;

public class stu_management{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name;
		int rollNo;
		int mark;
		
		System.out.println("Enter 1 for add student/2 for view student");
		int choice = sc.nextInt();
		
		if(choice == 1){
			System.out.println("RollNo:");
			rollNo = sc.nextInt();
			sc.nextLine();
			System.out.println("name:");
			name = sc.nextLine();
			System.out.println("mark:");
			mark = sc.nextInt();
			
			System.out.println("Student added successfully");
			System.out.println("RollNo: "+rollNo);
			System.out.println("Name:" +name);
			System.out.println("mark:" +mark);
		}else if (choice == 2) {
			System.out.println("No student data available");
		}
		else {
			System.out.println("Invalid Choice");
		}
		
	}
	
}