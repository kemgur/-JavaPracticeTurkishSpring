package day05;

import java.util.Scanner;

public class StringMethod03 {

	/*
	  Girilecek olan email adresinin kurallara uygun olup olmadigini kontrol edelim.
        
        onkisim @ sonkisim // a@b.c
          
        getEmailDogrulama(String email)
        
        return type => boolean
	 */
	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter your e-mail adress please ?:");
		String str= scan.nextLine();

		System.out.println(getEmailAdres(str));
		
		
		scan.close();
		
	}

	public static boolean getEmailAdres(String str) {

	
	int ch = str.indexOf('@');
	
	String str1 = str.substring(0 ,ch);
	String str2 = str.substring(ch);
		 
		if(str1.length()<1) {
			return false;
			
		}if(str2.length()<1) {
			return false;
			
		}if(str.length()<3) {
			return false;
			
		}if(str.contains(" ")) {
			return false;
		
		}if(!str.contains("@")) {
			return false;
		}else {
			return true;
		}
		
	}
}
