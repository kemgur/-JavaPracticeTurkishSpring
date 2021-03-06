package day04;

import java.util.Scanner;

public class CarpimToblosu {

	public static void main(String[] args) {
		//Kullanicidan bir sayi alalim ve onun carpim tablosunu yazdiralim
		// Get a number from the user and print it product table
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls enter a number");
		int num = scan.nextInt();
		
		if(num<1) {
			System.out.println("pls enter a valid number");
			
		}else {
		
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <=10; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
				
			}System.out.println("===========");//Her loop'tan sonra bosluk icin yazdik
			//System.out.println(i + " x " + num + " = " + i*num);
			
		}}
		scan.close();
	}

}
