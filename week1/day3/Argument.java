package week1.day3;

import java.util.Scanner;

public class Argument {

			
	public void addTwoNumber(int a, int b) {
		int c=a+b;
	    System.out.println(c);
		}
			
	public static void main(String[] args) {
		Argument val=new Argument();
				
		Scanner given=new Scanner(System.in);
				
		System.out.println("Enter the number:");
		int first=given.nextInt();
				
		System.out.println("Enter the number:");
		int second=given.nextInt();
		
	    val.addTwoNumber(first, second);
	}
}	



