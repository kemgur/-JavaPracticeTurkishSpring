package day06;

import java.util.Scanner;

public class Question07 {

		// Klavyeden girilen bir cumlede belerledigimiz bir harfin tekrar sayisini bulalim.
		//bugun hava cok sicak  //3 tane a harfi var
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String kelime=input.nextLine();
		System.out.println("Tekrari bulunacak harfi giriniz");
		String harf =input.next();
		
		int harfSayisi = 0;
		for (int i = 0; i < kelime.length(); i++) {
			if(kelime.substring(i, i+1).equals(harf)) {
				harfSayisi++;
			}
			
		}
		System.out.println(kelime +" kelimesinde "+harfSayisi + " tane " + harf + " var.");
		
		input.close();
	}

}
