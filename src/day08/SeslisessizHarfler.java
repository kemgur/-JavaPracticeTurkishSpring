package day08;

import java.util.Scanner;

public class SeslisessizHarfler {

	/* Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu, 
	 * değilse sessiz harf olduğunu ekrana yazdırsın. 
	 * Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı gostersin. 
	 * (Test girilen harfi buyuk yada kucukluğune duyarlıdır.)
​
Sesli harfler: a,e,i,o,u
​
Test Data: 
a
​
Beklenen cıktı:
a harfi sesli harfdir.
*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir karacter giriniz");
		String ch = scan.next().toLowerCase();
		
		boolean uppercase = ((ch.charAt(0)>='A')&&(ch.charAt(0)<='Z'));
		boolean lowercase = ((ch.charAt(0)>='a')&&(ch.charAt(0)<='z'));
		
		boolean sesli = ch.equals("a")||ch.equals("e")||ch.equals("o")||ch.equals("u")||ch.equals("i");
		
		if(ch.length()>1) {
			System.out.println("Yanlis karakter girdiniz");
		}else if(!(uppercase ||lowercase)) {
			System.out.println("Yanlis karakter girdiniz");
		}else if(sesli) {
			System.out.println(ch + " sesli harftir.");
		}else {
			System.out.println("sessiz harf");
		}
scan.close();
	}

}
