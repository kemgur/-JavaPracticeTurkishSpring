package day08;

import java.util.Arrays;

public class Array03 {

	// Bir int Array icerisinde aradigimiz sayinin 
			//olup olmadigini kontrol edelim

			//[12,32,34,54,45]
	
	public static void main(String[] args) {
		//1.Way
		int arr[]= {12,32,34,54,45};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 34));//2.indexte var.
		
		
		//2.Way
		int flag =0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==32) {
			flag++;
			}
		}
		if(flag!=0) {
			System.out.println("true");
		}
		
		//2.way
		for (int i = 0; i < arr.length; i++) {
			if(String.valueOf(arr[i]).contains("34")) {
			System.out.println("true");
			break;
			
			}else {
				System.out.println("false");
			}
		}
	}

}
