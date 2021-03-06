package day02;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		//Kullanicidan alinan sayinin notr, pozitif, negatif oldugunu kontrol edelim
		//Check that the number received from the user is neutral, positive, negative.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		String  result =(num<0)?("Negatif"):((num>0)?("pozitif"):("Notr"));
		System.out.println(result);
		
		scan.close();
	}

}
