package Employee_Wage;

import java.util.Random;

class Employee {
	public int computeDailyWage(int hours, int wagePerHour) {
	     return hours * wagePerHour;
	 }    
		   
	 public int getWorkingHours() {
	   
	 	int attendance = (int) (Math.random() * 3); 
	     switch (attendance) {
	         case 0:
	            return 0;
	           
	         case 1:
	             return 4; 
	           
	         case 2:
	            return 8; 
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

	     System.out.println("Total Wage  of Employ for" + (totalWorkingDays+1) + " days and " + totalWorkingHours + " hours is: " + totalWage);
	 }

      
 }


