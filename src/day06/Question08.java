package day06;

public class Question08 {

	// while dongusu ile birden 100 e kadar olan 
	//sayilarin toplamini soralim
	
	public static void main(String[] args) {
		
		int sayi =100;
		int sum =0;

		for (int i = 0; i <=sayi; i++) {
			
			sum+=i;
		}
		System.out.println(sum);
		
		
		//2.way
		int sum1 =0;
		int k =100;
		
		while(k>=0) {
			sum1 += k; 
			
			k--;	
		}
		System.out.println(sum1);
	}

}
