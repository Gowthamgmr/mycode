package week1.day3;

public class Breakandcontinue{

			public static void main(String[] args) {
				for(int i=1;i<=20;i++)
				{
					if(i==3)
					{
						System.out.println("Three");
						continue; //it exit the current line only
					}
					if(i==5)
					{
						//System.out.println("Five");
						continue;  //it exits the current line only
					}
					if(i==17)
					{
						break;  //it exits the loop
					}
					System.out.println(i);
				}
			}
		}
