package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Array01 {

	//Array elelmanlarini dogal siralayan bir kod yazalim
	//Let's write code that sorts Array elements
	
	public static void main(String[] args) {
//		int arr1[] = new int[4];
//		arr1[0] = 1;
//		arr1[1] = 2;
//		arr1[2] = 3;
//		arr1[3] = 4;
//		System.out.println(Arrays.toString(arr1));

	
//2.yol
	Scanner scan = new Scanner(System.in);
	System.out.println("Kac elemanli array istersiniz");
	int num = scan.nextInt();
	int[] arr = new int[num];
	
	for (int i = 0; i <num; i++) {
		//arr[i]=i;
		arr[i]=scan.nextInt(); //kullanicidan da alabiliriz
	}
		System.out.println(Arrays.toString(arr));
		
		
		scan.close();
	}
	
}
