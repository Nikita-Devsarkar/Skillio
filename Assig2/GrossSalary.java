//Write a Java program to calculate gross salary using basic salary and allowance variables

public class GrossSalary{
	public static void main(String[] args){
		double basicSalary = 15000;
        double allowance = 10000;

        double grossSalary = basicSalary + allowance;

        System.out.println("Basic Salary = " + basicSalary);
        System.out.println("Allowance = " + allowance);
        System.out.println("Gross Salary = " + grossSalary);
	}
}