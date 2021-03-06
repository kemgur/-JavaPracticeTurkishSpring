package day05;

import java.util.Scanner;

public class StringMethod01 {

	// Kullanicidan alacagimiz hotmail adresini gmail olarak degistirelim.
			//abc@hotmail.com => abc@gmail.com
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen mail adresinizi  giriniz");
		String mail = input.next();//kemgur@hotmail.com
		
		System.out.println(mail.replace("hot", "g"));//kemgur@gmail.com
		//replace() method replaces the characters.

		input.close();
	}

}
