package Employee_Wage;
import java.util.Random;





class Employee {
	 static final int WAGE_PER_HOUR = 20;
	    static final int FULL_DAY_HOURS = 8;
	    static final int PART_TIME_HOURS = 4;
	    
   //  check attendance (using random)
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
  
       
       public void computeWage() {
           // Check if employee is full-time, part-time or absent
           String attendance = checkAttendance();
           
switch (attendance) {
               case "FullTime":
                   System.out.println("Employee is FullTime");
                  
                   int dailyWageFullTime = WAGE_PER_HOUR *FULL_DAY_HOURS ;
                   System.out.println("Daily Wage: $" + dailyWageFullTime);
                   break;
               case "PartTime":
                   System.out.println("Employee is PartTime");
                   // Calculate wage for part-time hours
                   int dailyWagePartTime = WAGE_PER_HOUR * PART_TIME_HOURS;
                   System.out.println("Daily Wage: $" + dailyWagePartTime);
                   break;
              
                   
                   
               default:
               	System.out.println("Employee is Absent");
                   System.out.println("No wage computation.");
             
              }
       }

       
  }


  
   




	


public class EmployeeWageComputationSystem {
	public static void main(String[] args) {
	       System.out.println("Welcome to Employee Wage Computation");

	       // Create an instance of EmployeeAttendanceChecker
	       Employee employ = new Employee();

	       employ.computeWage();
	   }

}
