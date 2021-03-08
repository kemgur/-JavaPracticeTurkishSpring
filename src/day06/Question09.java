package day06;

import java.util.Scanner;

public class Question09 {

	// Kullanıcı 0 sayisi girene kadar girdigi sayilari  do while toplayalim.
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		int num = input.nextInt();
		
		int sum = 0;
		
		do {
			System.out.println("Tekrar sayi giriniz");
			sum +=num;
			num=input.nextInt();
			
		}while(num!=0);
		
		System.out.println("Tum sayilarin toplami: "+ sum);

		input.close();
	}

}
