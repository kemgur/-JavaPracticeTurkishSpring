package day05;

import java.util.Scanner;

public class QuestionMethod01 {

	 //Kullanıcidan iki sayi girmesini ve ardından islem 
	//secmesi istenecek.
    //Tüm islemler methodlarda yapilacak.
    //toplama , cikartma, carpma  ve bolme
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen 1. sayiyi giriniz");
		double num1 = input.nextDouble();
		System.out.println("Lutfen 2. sayiyi giriniz");
		double num2 = input.nextDouble();
		System.out.println("Choose one of the four actions: \n addition \n subtraction \n multiplication \n division");
		String islem = input.next().toLowerCase();

		action(islem,num1, num2);
		
		input.close();
	}

	public static void action(String islem,double num2,double num1) {
		
		switch(islem) {
		case "addition":
			toplama(num1,num2);
			break;
		case "subtraction":
			cikartma(num1,num2);
			break;
		case "multiplication":
			carpma(num1,num2);
			break;
		case "division":
			bolme(num1,num2);
			break;
		default:
			System.out.println("You took the wrong transaction");
			
		}
		
	}
	public static void toplama(double num1,double num2) {
		System.out.println("Toplama isleminin sonucu: " +(num1+num2));
	}
	public static void cikartma(double num1,double num2) {
		System.out.println("Cikartma isleminin sonucu: " +(num1-num2));
	}
	public static void carpma(double num1,double num2) {
		System.out.println("Carpma isleminin sonucu: " +(num1*num2));
	}
	public static void bolme(double num1,double num2) {
		System.out.println("Bolme isleminin sonucu: " +(num1/num2));
	}
}
