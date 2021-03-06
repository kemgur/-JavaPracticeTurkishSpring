package day04;

import java.util.Scanner;

public class StringMethod2 {

	public static void main(String[] args) {
		
		//Kullanicidan bir kelime alip tersini yazdiralim.
		//Let's take a word from the user and write the opposite.

		Scanner scan =new  Scanner(System.in);
		System.out.println("Enter a word.");
		String str = scan.nextLine();
		
		//1.Way
		String str1 = "";
		for (int i =str.length()-1; i >=0 ; i--) {
			str1 +=str.charAt(i);//chatrAt() methodunu kullanmayi unutma
		}
		System.out.println(str1);
		
		scan.close();
	}

	

}
