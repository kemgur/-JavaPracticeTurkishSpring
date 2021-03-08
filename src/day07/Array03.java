package day07;

public class Array03 {

	// Array elemanlarinin ortalamasini bulan java kodu yazalim.
			// 20,30,40,25,-15,55
	public static void main(String[] args) {
		
		int sum =0;
		
		int arr[]= {20,30,40,25,-15,55};
		for (int i = 0; i < arr.length; i++) {
			sum =sum +arr[i];
		}
	System.out.println(sum/arr.length);
	}

}
