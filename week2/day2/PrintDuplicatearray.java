package week2.day2;

public class PrintDuplicatearray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,2,1,3,4,5,6,7,5,6,8,9,10}
		for(i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]) {
					count++;
				}
				}
			if(count>1) {
					System.out.println(arr[i]);
			}
		  	
		}

	}

}
