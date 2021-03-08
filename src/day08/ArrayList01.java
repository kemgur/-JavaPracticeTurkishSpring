package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList01 {

	// String array icerisindeki 4 harfli kelimeleri return eden bir method yazalim.
	// Let's write a method that returns the 4 letter words in the string array.
	
	public static void main(String[] args) {
		
		String []str ={"sali","cuma","pazar","persembe","pers"};
		System.out.println(Arrays.toString(str));
		
		
		System.out.println(fourLetters(str));

	}

	public static List<String> fourLetters(String []str) {
		
		List <String> list = new ArrayList<>();
		
		for(String w : str) {
			if(w.length()==4) {
				list.add(w);
			}
			
			
		}
		return list;
	}
}
