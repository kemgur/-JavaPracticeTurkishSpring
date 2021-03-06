package day02;

import java.util.Scanner;

public class Ouestion02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age and weight");
		int age = scan.nextInt();
		int weight = scan.nextInt();
		
		String result = (age>18)?((weight>50)?("She can donate blood."):("People under 50 kilos cannot donate blood.")):("People under 18 years of age and under 50 kg cannot donate blood.");
		System.out.println(result);	
		
		scan.close();
	}

}
