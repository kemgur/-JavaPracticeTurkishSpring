package day05;

import java.util.Scanner;

public class QuestionInterview {

	/*
	  Kullanicidan bolunen ve bolen seklinde 2 sayi alin. 
	 Bolum operatoru kullanmadan bolme islemini
	 gerceklestirelim
	 
	 Take 2 numbers from the user as a division and a division. 
	 Let's perform the division without using the section operator.
	 */
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
		double i1=scan.nextDouble();//bolunen
		double i2=scan.nextDouble();//bolen

		double result =0;//bolum
		while(i1>=i2) {
			i1-=i2;
			result++;
		}
		System.out.println(result);
		scan.close();
	}

}
