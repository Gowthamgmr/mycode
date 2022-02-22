package week3.day1.methodOverriding;

public class PC extends Laptop {
	public void getSystemInfo() {
		System.out.println("mac");
	}
	public static void main(String[] args) {
		PC get=new PC();
		get.getSystemInfo();
		

	}

}
