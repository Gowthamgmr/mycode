package week1.day3;

import java.util.Scanner;

public class Primenumber {
   
	 public static void main(String[] args) {
      Scanner given=new Scanner(System.in);
	
	    System.out.println("Enter the number:");
	     int start=given.nextInt();
	
	    System.out.println("Enter the last number:");
	     int end=given.nextInt();
	
	      int count;

	      for (int i = start; i <= end; i++) {
	       count = 0;
	      for (int j = 2; j <= i / 2; j++) {
	       if (i % j == 0) {
	        count++;
	        break;
	     }
	   }

	   if (count == 0) {
	    System.out.println(i);
	     }
		  
	  }
   }
}
