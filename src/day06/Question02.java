package day06;


import java.util.Scanner;

public class Question02 {

	// Girilen sayinin tersini return eden java mrthodunu yaziniz
	//// Write the java method that returns the inverse of the entered number.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi yazınız");
		
		
	
		System.out.println(numberOfReverse(123));
	
		input.close();
	}
	public static int numberOfReverse(int num) {
		
		int sonuc =0;
		
		while(num>0) {
			int temp =num%10;
			num/=10;
			sonuc =sonuc*10 + temp; 
		}
		return sonuc;
		
		
	}
	//2.way
}

