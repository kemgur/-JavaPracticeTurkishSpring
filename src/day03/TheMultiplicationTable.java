package day03;

import java.util.Scanner;

public class TheMultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(num1 +" x " +num2 +" = "+ num1*num2++);
		System.out.println(num1 +" x " +num2 +" = "+ num1*num2++);
		System.out.println(num1 +" x " +num2 +" = "+ num1*num2++);
		System.out.println(num1 +" x " +num2 +" = "+ num1*num2++);
		System.out.println(num1 +" x " +num2 +" = "+ num1*num2++);
		System.out.println(num1 +" x " +num2 +" = "+ num1*num2++);
		System.out.println(num1 +" x " +num2 +" = "+ num1*num2++);
		System.out.println(num1 +" x " +num2 +" = "+ num1*num2++);
		System.out.println(num1 +" x " +num2 +" = "+ num1*num2++);
		System.out.println(num1 +" x " +num2 +" = "+ num1*num2);
		
		scan.close();
	}

}
