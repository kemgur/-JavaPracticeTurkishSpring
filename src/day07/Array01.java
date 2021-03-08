package day07;

import java.util.Arrays;

public class Array01 {

			// 3 elemanlı String array olusturalim//Let's create a 3-element string array
			// clever,meek,nice
			//tek tek ve liste halinde yazdiralim./// Let's print it one by one and in a list.
			// herbir array elemanina "ly" ekleyelim.//Let's add "ly" to each array element
	
	public static void main(String[] args) {
		
		String arr[] =new String[3];
		arr[0] ="clever";
		arr[1] ="meek";
		arr[2] ="nice";
		
		System.out.println(Arrays.toString(arr));//alist
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);//one and one
		}
		
	}

}
