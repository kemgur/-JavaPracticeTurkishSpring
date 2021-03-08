package day07;

public class AsalCozum {

	//Asal sayiyi bulan bir method yazalim
	// Let's write a method that finds the prime number
	
	public static void main(String[] args) {
		
		primeNumber(11);
					
		}
public static int primeNumber(int num) {
	
	int count =0;
	for (int i = 1; i <=num ; i++) {
		if(num%i == 0) {
			count++;
		}
		}
	if(count ==2) {
		System.out.println(num +" Prime numberdir");
		
	}else {
		System.out.println(num +" Prime number degildir");
	}
return num;
}		

}
