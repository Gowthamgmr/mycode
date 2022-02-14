package week1.day4;

public class Stringtochar {

	public static void main(String[] args) {
		String text="Gowtham GMR";
		
		char[] array=text.toCharArray();
		
		for(int i=0;i<text.length();i++)
		{
			System.out.println(array[i]);
		}

	}

}
