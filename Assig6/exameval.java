//Online exam evaluation system.
import java.util.Scanner;

public class exameval{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Q1/2 for Q2/3 for Q3/4 for Q4/5 for Q5");
		int Choice = sc.nextInt();
		int score = 0;
		char Correctans='A';
		
			if(Choice ==1){
				Correctans = 'A';
			}else if(Choice ==2){
				Correctans = 'D';
			}else if(Choice == 3){
				Correctans = 'B';
			}else if(Choice == 4){
				Correctans = 'A';
			}else if(Choice == 5){
				Correctans = 'C';
			}else{
				System.out.println("Invalid Choice");
				sc.close();
			}
 
		sc.nextLine();
		System.out.println("Enter Stu_name:");
		String name = sc.nextLine();
		
		System.out.println("Enter RollNo:");
		int RollNo = sc.nextInt();
		
		System.out.println("Enter Stu_Ans:");
		char Stud_ans = sc.next().charAt(0);
	
		if(Stud_ans == Correctans){
			System.out.println(Correctans+" is  correct Answer" );
			score= score++;
		}else{
			System.out.println("answer is not correct"+Correctans+"is correct Answer" );
		}
      
		
	}
}