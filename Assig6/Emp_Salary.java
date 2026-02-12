//Employee salary management system.
import java.util.Scanner;

public class Emp_Salary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the emp name:");
		String name = sc.nextLine();
		System.out.println("Enter the basic salary:");
		double basicsal = sc.nextInt();
		double hra, da, pf, gross_sal,net_sal;
		
		if(basicsal <= 10000){
			hra = basicsal * 0.20;
			da = basicsal * 0.50;
		} else {
			hra = basicsal * 0.30;
			da = basicsal * 0.60;
		}
		
		pf = basicsal * 0.10;
		
		gross_sal = basicsal + hra + da;
        net_sal = gross_sal - pf;
		
		System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicsal);
		System.out.println("Gross Salary: " + gross_sal);
        System.out.println("Net Salary: " + net_sal);
	}
}