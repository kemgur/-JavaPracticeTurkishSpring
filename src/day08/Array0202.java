package day08;

import java.util.Arrays;

public class Array0202 {

	
	// Girilen ifadeyi Array kullanarak tersine yazdiralim
	
	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,5,6,7};//Tek cift fark etmez
		System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7]
		
		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			
			arr[i]=arr[arr.length-i-1];//arr[i]'nin son elemanini birinci eleman olarak atadik.
			
			arr[arr.length-i-1]=temp;
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
