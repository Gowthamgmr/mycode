package week3.day1;

public class Student {
	public void getStudentInfo(int id) {
		System.out.println("User Id:"+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("User Id:"+id+",  User Name:"+name);
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("User eMail:"+email+", User phone Number:"+phoneNumber);
	}
	
	public static void main(String[] args) {
		Student get=new Student();
		get.getStudentInfo(567344);
		get.getStudentInfo(456372, "Gowtham");
		get.getStudentInfo("gowtham21j2000@gmail.com", 730555730);

	}

}
