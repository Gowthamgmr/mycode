package week1.day2;

public class Primenum {

	public static void main(String[] args) {
		int givenNum=45;
		int count=0;
		
		for(int i=1;i<=givenNum;i++)
		{
			int ans=givenNum%i;
			if(ans==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println("The given number prime number"+givenNum);
		}
		else
		{
			System.out.println("The given number is not a prime number"+givenNum);
		}
	}
}
