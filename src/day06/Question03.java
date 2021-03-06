package day06;

import java.util.Scanner;

public class Question03 {

	/*
	 // Saat ve dakika girildiginde saniye return eden java methodu yazalim
		// 1 saat 3600 sn
		// 1 dakika 60 sn
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen saat giriniz");
		int saat = input.nextInt();
		System.out.println("Lutfen dakika giriniz");
		int dakika = input.nextInt();

		System.out.println(seconds(saat,dakika));
		
		input.close();
	}

	public static long seconds(int saat,int dakika ) {
		long secondss = ((saat*3600) + (dakika*60));
		
		return secondss;
	}
}
