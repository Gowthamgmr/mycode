package week3.day1;

public class Desktop extends Computer {
       public void OS(String x ,String y,String z) {
    	   System.out.println(x+y+z);
       }
	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.dell();
		obj.Apple();
		obj.OS("Windows","Linex","Mac");
		
	  
	}

}
