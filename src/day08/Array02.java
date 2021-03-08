package day08;

import java.util.Scanner;

public class Array02 {
	
	//// Girilen ifadeyi Array kullanarak tersine yazdiralim
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir string giriniz");
		String str=scan.nextLine();

		String[] arr = str.split("");
		
		String ters ="";
		for (int i=arr.length-1; i>=0 ; i--) {
			ters +=arr[i];
		}
		System.out.println(ters);
		
		scan.close();
	}

	
}
