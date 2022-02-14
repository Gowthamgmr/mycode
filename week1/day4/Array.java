package week1.day4;

public class Array {
	public static void main(String[] args) {
		int[] number= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		System.out.println("------------");
          System.out.println(number.length);
        System.out.println("------------");  
	      System.out.println("first index:"+"  "+number[0]);
	      System.out.println("last index:"+"  "+number[8]);
	}	
}