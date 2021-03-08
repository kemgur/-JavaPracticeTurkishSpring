package day06;

import java.util.Scanner;

public class Question06 {

	// Girilecek bir stringin her karakterini satir satir yazdiralim
			//kemal
			//k
	        //e
			//m
			//a
			//l
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir isim giriniz");
		String isim=scan.nextLine();
		
		for (int i = 0; i < isim.length(); i++) {
		
			String harf = isim.substring(i,i+1);
			System.out.println(harf);
		}
		scan.close();
	}

}
