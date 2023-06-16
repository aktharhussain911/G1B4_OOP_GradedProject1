package departmentDriver;

import java.util.Scanner;
// Importing all the user-defined classes from "model" package
import com.greatlearning.model.*;

public class departmentDriverApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice = 0;
		Scanner sc= new Scanner(System.in);
		superDepartment sd = new superDepartment();
		hrDepartment hrd = new hrDepartment();
        techDepartment td = new techDepartment();
        adminDepartment ad = new adminDepartment();
        
        System.out.println(" 1 - Super Department");
        System.out.println(" 2 - Admin Department");
        System.out.println(" 3 - HR Department");
        System.out.println(" 4 - Tech Department");
        System.out.println(" \n Enter your choice : ");

        choice=sc.nextInt();
	
	switch (choice)
	{
			case 1:
			System.out.println(sd.departmentName());
	        System.out.println(sd.getTodaysWork());
	        System.out.println(sd.getWorkDeadline());
	        System.out.println(sd.isTodayAHoliday());
	        break;
	        
		case 2:
			System.out.println(ad.departmentName());
	        System.out.println(ad.getTodaysWork());
	        System.out.println(ad.getWorkDeadline());
	        break;
	        
		case 3:
			System.out.println(hrd.departmentName());
	        System.out.println(hrd.getTodaysWork());
	        System.out.println(hrd.getWorkDeadline());
	        System.out.println(hrd.doActivity());
	        break;
	        
		case 4:
			System.out.println(td.departmentName());
	        System.out.println(td.getTodaysWork());
	        System.out.println(td.getWorkDeadline());
	        System.out.println(td.getTechStackInformation());
	        break;
	        
	    default:
	        System.out.println("\n Please Enter Valid Choice");
	}
   }
}
