package Employee_Wage;

import java.util.Scanner;

  abstract class Company{  
	 
	
	  
	   
	abstract public int  computeDailyWage(int hours, int wagePerHour);
	 abstract public void computeMonthlyWage(int wagePerHour, int maxWorkingDays, int maxWorkingHours);
	  
  }
class Employee extends Company
{
	

	
	   @Override
	    public int computeDailyWage(int hours, int wagePerHour) {
	        return hours * wagePerHour;
	    }    
		   
	    public int getWorkingHours() {
	      
	    	int attendance = (int) (Math.random() * 3); //0, 1, 2
            switch (attendance) {
                case 0:
                   return 0; // 0 hours absent
                  
                case 1:
                    return 4; // 4 hours for part-time
                  
                case 2:
                   return 8; // 8 hours for full-time
                   
            }
			return 0;
	    }
  
	    public void computeMonthlyWage(int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
	        int totalWage = 0;
	         int totalWorkingDays = 0;
	        int totalWorkingHours = 0;

	        while (totalWorkingDays < maxWorkingDays && totalWorkingHours < maxWorkingHours) {
	            int hours = getWorkingHours();
	            if (hours > 0) {
	                int dailyWage = computeDailyWage(hours, wagePerHour);
	                totalWage += dailyWage;
	             
	                totalWorkingHours += hours;

	                System.out.println("Day " + totalWorkingDays + ": Hours Worked " + hours + " : Total Hours: " + totalWorkingHours);
	               
	            }
	            else {
	            	System.out.println("Day " + totalWorkingDays + "absent");
	            }
	            totalWorkingDays++;
	        }

	        System.out.println("Total Wage  of Employ for" + totalWorkingDays + " days and " + totalWorkingHours + " hours is: " + totalWage);
	    }

	   
	        
	       
	    
	}

public class EmployeeWageComputationSystem {
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
	     ;
	       

	      
	   }

}
