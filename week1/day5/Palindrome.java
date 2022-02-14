package week1.day5;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner get=new Scanner(System.in);
		System.out.println("Enter the string to check:");
		String value=get.nextLine();
		
		String rev="";
		
		for(int i=value.length()-1;i>=0;i--)
		{
			rev=rev+value.charAt(i);
		}
		if(value.equalsIgnoreCase(rev))
		{
			System.out.println("The given string is Palindrome");
		}
		else
		{
			System.out.println("The given string is not a Palindrome");
		}
	}
}
