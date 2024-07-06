package Employee_Wage;
import java.util.Random;

    
class Employee {
	
	    static final int IS_ABSENT = 0;
	    static final int IS_FULL_TIME = 1;
	    static final int IS_PART_TIME = 2;

	  
	    public int computeDailyWage(int hours) {
	    	int wagePerHour=20;
	        return hours * wagePerHour;
	    }

	  
	    public int getWorkingHours() {
	        Random random = new Random();
	        int attendance = random.nextInt(3); 
	        switch (attendance) {
	            case IS_ABSENT:
	                return 0;
	            case IS_FULL_TIME:
	                return 8;
	            case IS_PART_TIME:
	                return 4;
	            default:
	                return 0;
	        }
	    }

	    
	    public void computeMonthlyWage() {
	        int totalWage = 0;
	        int totalWorkingDays = 0;
	        int totalWorkingHours =0;
	        int maxWorkingDays=20;
	        int maxWorkingHours=100;

	        while (totalWorkingDays < maxWorkingDays && totalWorkingHours < maxWorkingHours) {
	            int hours = getWorkingHours();
	            if (hours > 0) {
	               
	             
					int dailyWage = computeDailyWage(hours);
	                totalWage += dailyWage;
	               
	                totalWorkingHours+= hours;
	                System.out.println( "day"+( totalWorkingDays+1)+ " Hours Worked: " + hours + "  Wage: " + dailyWage);
	            } 
	            else {
	                System.out.println(  "Day"+(totalWorkingDays+1)+" Employee is absent");
	                
	            }
	            totalWorkingDays++;
	        }
	       
	        System.out.println("Total Wage for "   + totalWorkingDays + " days and " + totalWorkingHours + " hours is: " + totalWage);
	    }

	  

		
	      
	           
	       
	   

 }

public class EmployeeWageComputationSystem {
	public static void main(String[] args) {
	       System.out.println("Welcome to Employee Wage Computation");

	       
	       Employee employ = new Employee();
	       
	        
	        employ.computeMonthlyWage();
	       

	      
	   }

}
