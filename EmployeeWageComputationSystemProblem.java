package Employee_Wage;

import java.util.Scanner;

public class EmployeeWageComputationSystemProblem {
	public static void main(String[] args) {
		       System.out.println("Welcome to Employee Wage Computation");
	           Scanner scan=new Scanner(System.in);
		       Employee employ = new Employee();
		       System.out.println("Enter the no.of Companies");
		       int n=scan.nextInt();
		        for(int i=0;i<n;i++) {
		        System.out.println("Enter the details of Company(Company Name,Wage per Hour,Maximum Working Days,Maximum Working Hours)Ex:(companyA,20,20,100))");
		        String s=scan.next();
		        String[] st=s.split(",");
		        int mWD=Integer.parseInt(st[2]);
		        String cName=st[0];
		        int wPH=Integer.parseInt(st[1]);
		        int mWH=Integer.parseInt(st[3]);
		        System.out.println("Employ of"+cName);
		        employ.computeMonthlyWage(wPH,mWD,mWH);
		        System.out.println("----------");
		        }
	}

}
