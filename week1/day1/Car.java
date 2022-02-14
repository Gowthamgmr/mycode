package week1.day1;
 
 public class Car {

	   void start() {
		System.out.println("Engine-Start");
	}
	
	   void accelerate() {
		System.out.println("car Move");
	}
	
	   void stop() {
		System.out.println("Engine-off");
	}
	public static void main(String[] args) {
		
		Car action=new Car();
		action.start();
		action.accelerate();
		action.stop();

	}

}
