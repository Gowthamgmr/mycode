package week1.day5;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1="steps";
		String text2="petss";
		
		if(text1.length()==text2.length())
		{
			System.out.println("Two texts are same length");
			

			char[] arr1=text1.toCharArray();
			char[] arr2=text2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2))
			{
				System.out.println("It is a anagaram");
			}
			else
			{
				System.out.println("It is not a anagram");
			}
		}
		else
		{
			System.out.println("Two texts are in different length");
		}
		 
	}
}
