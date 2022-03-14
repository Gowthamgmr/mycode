package week4.day2;

public class Removedup {

	public static void main(String[] args) {
		String act = "We learn java basics as part of java sessions in the java week1";
		//char[] charArray = act.toCharArray();
	    //System.out.println(charArray);
		String[] eachWord = act.split(" ");
		for (int i = 0; i < eachWord.length; i++) {
		 //System.out.print(eachWord[i]);
			for (int j = i+1; j < eachWord.length; j++) {
				if (eachWord[i].equals(eachWord[j])) {
					eachWord[j]=" ";
				}
			}
			System.out.print(eachWord[i]+" ");	

	  }

   }

}	
