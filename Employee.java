package Employee_Wage;

import java.util.Random;

class Employee 
{         
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


