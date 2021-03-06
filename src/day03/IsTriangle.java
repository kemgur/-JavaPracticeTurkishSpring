package day03;

import java.util.Scanner;

public class IsTriangle {

	/*
	 3 sayi alin ucgen mi degil mi kontrol edin.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a-b<c && c<a+b && a-c<b && b<a+c && b-c< a&& a<c+b) {
			if(a==b&& a==c && a==c) {
				System.out.println("it is a equilateral triangle");
				
			}else {
				System.out.println("it is not a equilateral triangle");
			}
			
		}else {
			System.out.println("There are no a triangle from the given numbers");
		}						//verilen sayilardan bir ucgen olmaz

		scan.close();
	}

}
