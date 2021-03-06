package day04;

public class UcBesVeOnBesBolme {

	public static void main(String[] args) {
		
		//1 den 100 e kadar olan sayilarda 3'e, 5,e ve 15 e bolunen sayilari yazdiralim
		//Let's write the numbers from 1 to 100 divided by 3, 5, e and 15.
		System.out.print("\n 3'e bolunen sayilar \n");
		for (int i = 1; i <= 100; i++) {
			if(i%3==0) {
				System.out.print( + i + " ");	
			}
		
		}
		System.out.println("\n 5'e bolunen sayilar ");
		for (int i = 1; i <= 100; i++) {
			if(i%5==0) {
				System.out.print( + i + " ");	
			}
			
		}
		System.out.println("\n 15'e bolunen sayilar ");
		for (int i = 1; i <= 100; i++) {
			if(i%15==0) {
				System.out.print( + i + " ");	
			}
			
		}
	}

}
