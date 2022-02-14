package week1.day4;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		System.out.println("length of the array:"+arr.length);
		System.out.println("");
		
		System.out.println("Duplicate values are:");
		
		for (int i = 0; i < arr.length-1; i++) 
		{
			
			for (int j = i+1; j <arr.length; j++) {
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
			
		}

	}

}
