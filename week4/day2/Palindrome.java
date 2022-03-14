package week4.day2;

public class Palindrome {

	public static void main(String[] args) {
		String name=new String("AkkA");
		String rev =new String("");
		for(int i =name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev)) {
		System.out.println("The Given String is Palindrome");
		}
		else {
			System.out.println("The Given String is not a Palindrome");
			
		}
		

	}

}
