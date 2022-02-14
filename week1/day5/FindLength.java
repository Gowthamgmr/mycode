package week1.day5;

import java.util.Scanner;

public class FindLength {

			public void lengthOfTheString(String name) {
				int value= name.length();
				System.out.println("Length of the string:"+value);
			}
			
			public void stringToChar(String name) {
				char[] charArray=name.toCharArray();
				System.out.println("String to char:"+charArray);
			}
			
			public void compare(String name, String name1)
			{
				System.out.println(name.equalsIgnoreCase(name1));
			}
			
			
			public static void main(String[] args) {
				//create a method
				FindLength given=new FindLength();
				
				//to get the string from user
				Scanner get=new Scanner(System.in);
				System.out.println("Enter the Name:");
				String val=get.nextLine();
				String val1=get.nextLine();
						
				//call the methods
				given.lengthOfTheString(val);
				
				given.stringToChar(val);
				
				given.compare(val, val1);

	}

}
