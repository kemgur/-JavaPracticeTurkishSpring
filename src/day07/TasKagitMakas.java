package day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

	/*
	 1) 3 tane degiskenimiz olsun
	 2) Bunlari bir array listte tutalim
	 3) Kullanici bunlardan birini sececek
	 4) Sonra bilgisayar bir tane sececek
	 5) Bunlari karsilastiracagiz.
	 6) 3 kez kazanan oyunu kazanir
	 */
	public static void main(String[] args) {
			     // tas >makas
				 // makas >kagit
				 // kagit >tas
		int numberOfMyWin=0;
		int numberOfComWin =0;
		int gameOver=3;
		
		List <String> elemanlar = new ArrayList<>();
		elemanlar.add("Tas");
		elemanlar.add("Makas");
		elemanlar.add("Kagit");
		Scanner scan=new Scanner(System.in);
		
		while (numberOfMyWin<gameOver && numberOfComWin<gameOver) {
			System.out.println("   Tas secmek icin 0 \n Makas secmek icin 1 \n Kagit secmek icin 2 \n seciniz.");
			int myGuess =scan.nextInt();
			int comGuess= new Random().nextInt(3);//Ramdom() methodu rastgele 0,1,2 sayidan birini secer. 
			System.out.println("Benim Tahminim:"+ myGuess + "\n" + "Bilgisayarin Tahmini:" + comGuess);
			
			if(myGuess==comGuess) {
				System.out.println("Berabere");
			}else if ((myGuess==0 && comGuess==1)||(myGuess==1 &&comGuess==2) || (myGuess ==2 && comGuess==0)) {
				System.out.println("Kazandiniz");
				numberOfMyWin++;
			}else {
				System.out.println("Bilgisayar kazandi");
				numberOfComWin++;
			}
		}
	
		if(numberOfMyWin==3) {
		System.out.println("==GAME OVER==");
		System.out.println("Sizin kazandiniz: " + numberOfMyWin);
		System.out.println("Kabettiniz: " +numberOfComWin);
		
		}else if(numberOfComWin==3){
		System.out.println("==GAME OVER==");
		System.out.println("Biligisayar kazandi: " + numberOfComWin);
		System.out.println("Kabettiniz: " +numberOfMyWin);
		}
		

		scan.close();
		
	}

}
