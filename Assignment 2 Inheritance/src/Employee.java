import java.util.Scanner;

public class Employee {
	int Emp_id;
	long Mobile_no;
	String Emp_name, Address, Mail_id;
	
	Scanner get = new Scanner(System.in);
	
	void getdata() {
		System.out.println("Enter the name of Employee :");
		Emp_name = get.nextLine();
		
		System.out.println("Enter Resedential Address : ");
		Address = get.nextLine();
		
		System.out.println("Enter Mail ID : ");
		Mail_id  = get.nextLine();
				
		System.out.println("Enter Employee ID : ");
		Emp_id = get.nextInt();
		
		System.out.println("Enter Mobile No. : ");
		Mobile_no = get.nextLong();
		}
	void display() {
		System.out.println();
		System.out.println("Employee Name : "+ Emp_name);
		System.out.println("Employee ID : "+ Emp_id);
		System.out.println("Address : "+ Address);
		System.out.println("Mail ID : "+ Mail_id);
		System.out.println("Mobile NO. : "+ Mobile_no);
	}
}


