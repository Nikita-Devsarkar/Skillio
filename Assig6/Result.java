//Result processing system.
import java.util.Scanner;

public class Result{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of 5 subjects: ");
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int mark4 = sc.nextInt();
        int mark5 = sc.nextInt();

        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        double percentage = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 75) {
            System.out.println("Grade: Distinction");
        } 
        else if (percentage >= 60) {
            System.out.println("Grade: First Class");
        } 
        else if (percentage >= 50) {
            System.out.println("Grade: Second Class");
        } 
        else if (percentage >= 35) {
            System.out.println("Grade: Pass");
        } 
        else {
            System.out.println("Result: Fail");
        }

    }
}
