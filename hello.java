package Employee_Wage;
import java.util.Random;
import java.util.Scanner;

abstract class Employee12 {
 private String name;

 
 
 
 public Employee12(String name) {
     this.name = name;
     
 }
 
 
 public abstract boolean isPresent();
 

 public abstract int calculateDailyWage();
 
 public abstract int calculateMonthlyWage();
 public String getName() {
     return name;
 }
 
 

}


class FullTimeEmployee extends Employee12 {
 private static final int WAGE_PER_HOUR = 20;
 private static final int FULL_DAY_HOURS = 8;
 private final int MAX_HOURS_IN_MONTH = 100;
 private final int MAX_WORKING_DAYS = 20;
 int totalWorkingHours = 0;
 int totalWorkingDays = 0;

 
 public FullTimeEmployee(String name) {
     super(name);
     
 }
 
 
 @Override
 public boolean isPresent() {
	 	        Random random = new Random();
	        int randomInt = random.nextInt(2); // 0, 1, or 2

	        switch (randomInt) {
	            case 0:
	                return true;
	           
	            default:
	                return false;
	        }
	    
 }
 
 
 @Override
 public int calculateDailyWage() {
     if (!isPresent()) {
         return 0;
     }
     return WAGE_PER_HOUR * FULL_DAY_HOURS;
 }
 public int calculateMonthlyWage() {
	
	     int totalWage = 0;
	    
	         while (totalWorkingHours <= MAX_HOURS_IN_MONTH && totalWorkingDays < MAX_WORKING_DAYS) {
	    	              totalWorkingDays++;
	         int dailyHours = 0;
             int dailyWage = calculateDailyWage();
	         totalWage += dailyWage;
	     }
	     

	     return totalWage;
	 }

}


class PartTimeEmployee extends Employee12 {
	
 public PartTimeEmployee(String name) {
		super(name);
		
	}
private static final int WAGE_PER_HOUR = 20;
 private static final int PART_TIME_HOURS = 4;
 
 private final int MAX_HOURS_IN_MONTH = 100;
 private final int MAX_WORKING_DAYS = 20;
 int totalWorkingHours = 0;
 int totalWorkingDays = 0;

 

 

 
 @Override
 public boolean isPresent() {
      Random random = new Random();
 int randomInt = random.nextInt(2); // 0, 1, or 2

 switch (randomInt) {
     case 0:
         return true;
    
     default:
         return false;
 }

}

 
 
 @Override
 public int calculateDailyWage() {
     if (!isPresent()) {
         return 0;
     }
     return WAGE_PER_HOUR * PART_TIME_HOURS;
 }
 public int calculateMonthlyWage() {
     int totalWage = 0;
    
         while (totalWorkingHours <= MAX_HOURS_IN_MONTH && totalWorkingDays < MAX_WORKING_DAYS) {
    	 totalWorkingDays++;
         int dailyHours = 0;

       if(isPresent()) {
         int dailyWage = calculateDailyWage();
         totalWage += dailyWage;
         System.out.println("Employee present on"+totalWorkingDays);
       }
       totalWorkingHours += dailyHours;
     }
     

     return totalWage;
 }

}



public class hello {
	public static void main(String[] args) {
	     
	     FullTimeEmployee fullTimeEmp = new FullTimeEmployee("John Doe");
	     PartTimeEmployee partTimeEmp = new PartTimeEmployee("Jane Smith");
	     
	     
	     System.out.println("Full-Time Employee:");
	     System.out.println("Name: " + fullTimeEmp.getName());
	    
	  
	         System.out.println("Monthly Wage: " + fullTimeEmp.calculateMonthlyWage());
	     
	     
	     System.out.println();
	     
	    
	     System.out.println("Part-Time Employee:");
	     System.out.println("Name: " + partTimeEmp.getName());
	      System.out.println("Monthly Wage: " + partTimeEmp.calculateMonthlyWage());
	     
	    
	 }
}
