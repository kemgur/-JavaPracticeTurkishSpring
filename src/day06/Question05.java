package day06;

import java.util.Scanner;

public class Question05 {

	//Girilen sayinin rakamlarini toplayin
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi yazınız");
		int num = input.nextInt();
		
		int sum = 0;
		while(num>0) {
			
			int temp = num%10;
			sum = sum +temp;
			num/=10;
			
		}
		
		System.out.println(sum);

		input.close();
	}

}
