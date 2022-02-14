package week1.day3;

import java.util.Scanner;

public class Employeedetails {
	 public void employeeName()
	{
		String Name="Gowtham.R";
		int Id=1721016;
		System.out.println("Employee Name:"+Name);
		System.out.println("Employee ID:"+Id);
	}
	
	public void employeeAddress(String address)
	{
		System.out.println("Employee Address:"+address);
	}
	
	public void employeeSalary()
	{
		double Salary=775000.00;
		System.out.println("Employee Salary:"+Salary);
	}
	
	public void mobileNumber()
	{
		long Number=9080829503l;
		System.out.println("Employee Ph.No:"+Number);
	}
	
	
	public static void main(String[] args) {
		
		Employeedetails details=new Employeedetails();
		
		details.employeeName();
		details.mobileNumber();
		details.employeeSalary();
		
		Scanner add=new Scanner(System.in);
		
		System.out.println("Enter the address:");
		
		String area=add.nextLine();
		details.employeeAddress(area);
	}
}

