package Employee_Wage;
import java.util.Random;

    
class Employee {
	

	
	   
	    private static final int WAGE_PER_HOUR = 20;
	    private static final int FULL_DAY_HOURS = 8;
	    private static final int PART_TIME_HOURS = 4;
	    private static final int WORKING_DAYS_PER_MONTH = 20;
	  

	    public String checkAttendance() {
	       	
	       	Random random = new Random();

	    		int randomInt = random.nextInt(3); // 0, 1, or 2

	           switch (randomInt) {
	               case 0:
	                   return "FullTime";
	               case 1:
	                   return "PartTime";
	               default:
	                   return "Absent";
	           }

	       }
	      
	           
	           public int calculateDailyWage() {
	             
	               String attendance = checkAttendance();
	               
	    switch (attendance) {
	                   case "FullTime":
	                      
	                      
	                      return  WAGE_PER_HOUR *FULL_DAY_HOURS ;
	                      
	                   case "PartTime":
	                     
	                     return  WAGE_PER_HOUR * PART_TIME_HOURS;
	                     
	                       
	                       
	                   default:
	                  
	                             return 0;
	                  }
	           }

		
	      
	           
	       
	    public int calculateMonthlyWage() {
	        int totalWage = 0;
	        
	       
	        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
	            
	            int dailyWage = calculateDailyWage();
	            totalWage += dailyWage;
	           
	        }

	        return totalWage;
	    }

 }

public class EmployeeWageComputationSystem {
	public static void main(String[] args) {
	       System.out.println("Welcome to Employee Wage Computation");

	       
	       Employee employ = new Employee();
	       int monthlyWage = employ.calculateMonthlyWage();
	        System.out.println("Total Monthly Wage: $" + monthlyWage);

	      
	   }

}
