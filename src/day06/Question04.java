package day06;

public class Question04 {

	// uc sayi arasindaki en buyuk sayi methodunu yazalim
	public static void main(String[] args) {
		
		bigger(2,3,4);
		
	}
	
	public static void bigger(double a,double b, double c) {
		
		if(a>b && a>c) {
		System.out.println("En buyuk sayi " +a);
	
	   }if(b>a && b>c) {
		System.out.println("En buyuk sayi " +b);
	
	  }if(c>b && c>a) {
		System.out.println("En buyuk sayi " +c);
	
  	  }else if(a==b && b==c) {
  		System.out.println("Sayilar biribirine esittir");
  		  

}
}
}