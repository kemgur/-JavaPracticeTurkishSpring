package day03;

import java.util.Scanner;

public class DortIslemdenBiriniSec {

	/*
	 Kullanici 4 islemden birini secer
	 kllanici 2 sayi girer
	 sonucu yazdirir
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please select one of the 4 actions.\n" + 
				"1-Addition\n2-Subtraction\n3-Division\n4-Multiplication");//Lutfen 4 islemden birini secin.
		
		String islem = scan.next();
		
		if(!islem.equals("1") && !islem.equals("2") && !islem.equals("3") && !islem.equals("4")) {
			System.out.println("Pls ckoose a valid transaction.");
			
		}else {
			
			System.out.println("Pls enter 2 numbers");
			
		}
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		
		
		if(islem.equalsIgnoreCase("1")) {
			System.out.println(num1 + " to " +num2 + " total "+  (num1 + num2));
		}else if(islem.equalsIgnoreCase("2")) {
			System.out.println(num1 + " to " +num2 + " difference "+  (num1 - num2));
			
		}else if(islem.equalsIgnoreCase("3")) {
			System.out.println(num1 + " to " +num2 + " divided "+  (num1 / num2));
			
		}else if(islem.equalsIgnoreCase("4")) {
			System.out.println(num1 + " to " +num2 + " product "+  (num1 * num2));
			
		}else{
			System.out.println("Pls choose a valid transaction.");//Pls geçerli bir işlem seçin

		
			scan.close();
		}
	}

}
