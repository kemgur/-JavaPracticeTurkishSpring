package day06;

import java.util.Scanner;

public class Question01 {

	 //Kullanıcıda bir String kümesi girmesini isteyelim.  Kaç kelimeden
    //oluştuğunu gosteren java methodu yazınız.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir kelime grubu giriniz");
		String str = input.nextLine();
		
		System.out.println(numberOfWords(str));
		
		input.close();
	}

	public static int numberOfWords(String str) {
		
		int count =0;
		
		String[] str1 = str.split(" ");
		
		for (int i = 0; i < str1.length; i++) {
			count++;
			
		}
		return count;
		
		
		//2.Way
		/*
		  //Kullanıcıda bir String kümesi girmesini isteyelim ve Kaç kelimeden
        //oluştuğunu dönen java methodu yazınız.
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir kelime grubu grubu giriniz");
		String str = input.nextLine();
		
		System.out.println("Metindeki kelime sayisi: " +kelimeSayisi(str));
		
		input.close();
		
	}
	public static int kelimeSayisi(String str) {
		
		int count=0;
		for (int i = 0; i <str.length(); i++) { //Today it's very hot
			
			if (str.charAt(i)==' ') {
				count++;
			}
			
		}
		count=count+1;//Kelime sayisi bosluk sayisindan her zaman bir fazladir.
		return count;
		 */
	}
}
