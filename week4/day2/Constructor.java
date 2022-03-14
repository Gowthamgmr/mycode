package week4.day2;

public class Constructor {
	String empname;
	int empnum;
	double salary;
	float ebbill;
	boolean active;
	
	Constructor(){
		System.out.println("defualt constuctor");
	}
	Constructor(String empname,int empnum,double salary){
		//to call the constructor in another constructor
		this();
		this.empname=empname;
		this.empnum=empnum;
		this.salary=salary;
		
	}

	public static void main(String[] args) {
		Constructor emp=new Constructor("sara",111,100.0);
		System.out.println(emp.empname);
		System.out.println(emp.empnum);
		System.out.println(emp.salary);
		//System.out.println(obj.ebbill);
		//System.out.println(obj.active);
		
		
		

	}

}
