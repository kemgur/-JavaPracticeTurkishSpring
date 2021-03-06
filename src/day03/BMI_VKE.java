package day03;

import java.util.Scanner;

public class BMI_VKE {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  numbers");
		double height = scan.nextDouble();
		double weight = scan.nextDouble();
		
		double BMI = weight/(height*height);
		
		if(BMI<=20) {
			System.out.println("you are very weak");
			
		}else if(BMI>0 && BMI<=25) {
			System.out.println("you are normal");
			
		}else if(BMI>25 && BMI<=30) {
			System.out.println("you are so fat");
			
			
		}else if(BMI>30) {
			System.out.println("You are fat, you should do sports");
			
			
		}

		scan.close();
	}

}
