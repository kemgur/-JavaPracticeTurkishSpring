package day02;

import java.util.Scanner;

public class Ouestipn01 {

	public static void main(String[] args) {
	
		/*
		 Let's get 5 digits from user.(Kullanicidan 5 basamakli sayi alalim) 
		 Let's add the numerical values ​​of the numbers in the first 2 and the last 2 digits.
		 (ilk 2 ve son 2 basamaklarindaki sayilarin sayi degerlerini toplayalim.)
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 digits number");
		int num = scan.nextInt();//12345
		
		int ilkiki= num/1000;//12
		int soniki = num%100;//34
		System.out.println(ilkiki +"\n" +soniki );
		
		int ilkikiTop =(ilkiki%10) +(ilkiki/10);//3
		int sonikiTop = (soniki%10) + (soniki/10);//9
		System.out.println(ilkikiTop +sonikiTop);//12

		scan.close();
	}

}
