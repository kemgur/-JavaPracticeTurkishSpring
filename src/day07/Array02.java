package day07;

import java.util.Arrays;

public class Array02 {

	//Array elemanlarinin matematige gore tersini alan bir method yazalim.
    //1,2,-3,4,-5,-6
    //-1,-2,3,-4,5,6
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,-3,4,-5,-6};

		for (int i = 0; i < arr.length; i++) {
			System.out.print((arr[i]*=-1) + (" "));
			
			System.out.println(Arrays.toString(sayininTersi(arr)));
			
		}
	}
	//2.Way
		public static int[] sayininTersi(int[] arr) {
			
			for (int i = 0; i < arr.length; i++) {
				arr[i]*=-1;
			}
			return arr;
		
	}

	}
