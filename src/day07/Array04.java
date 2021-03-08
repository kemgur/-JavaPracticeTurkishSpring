package day07;

public class Array04 {

	// Bir int array içerisindeki tekrarlanan elemani bulan kodu yazalim.
	
	public static void main(String[] args) {
		
		int []arr = {1,2,3,3,4,4,5,6,7,7,8,8,9};

		tekrarVarmi(arr);
	}

	public static void tekrarVarmi(int[]arr) {
		
		int flag =0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]==arr[j] && (i!=j)) {
					
					System.out.println("Tekrarlanan eleman: " + arr[j]);
					flag++;
				}
			}
			
		}
	System.out.println(flag);
	if(flag ==0) {
		System.out.println("Tekrarlanan eleman yok.");
	}
	}
}
