package day03;

import java.util.Scanner;

public class UstAlma {

	/*
	 kullanicidan 2 sayi alin.
	 1. sayi taban
	 2. sayi ust
	 1.sayinin ustunu hesaplayin.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int taban = scan.nextInt();//5
		int ust = scan.nextInt();//3
		long sonuc = 1;
		
		
		//1.way with while
		while(ust!=0) {
			sonuc*=taban;//sonuc=sonuc*taban
			ust--;	
		}
		System.out.println(sonuc);//125
		
		
		//2.way
		for ( ; ust!=0 ; --ust) {
			sonuc*=sonuc;		
		}
		System.out.println(sonuc);
		
		
		
		//3.way
		//Math class'indaki pow() methodunu kullandik. 
		//pow() methodu ust almamizi saglar.
		sonuc = (long) Math.pow(taban, ust);
		System.out.println(sonuc);
		
		
		
		
		scan.close();
	}

}
