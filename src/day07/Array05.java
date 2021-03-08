package day07;

public class Array05 {

	// Array elemanlari	arasinda en buyuk olani bulan methodu yazalim
	public static void main(String[] args) {
		
		int []arr= {12,54,53,23};
		int max =0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("array'in en buyuk elemani: " + max);
	}

}
 