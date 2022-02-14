package week1.day4;

import java.util.Arrays;

public class Ascendingorder {

	public static void main(String[] args) {
				
				int[] a={76,18,394,49,43,5,75};
				
				Arrays.sort(a);
				
				for (int i = a.length-1; i >=0; i--) {
					System.out.println(a[i]);
				}
				
			}
		}


