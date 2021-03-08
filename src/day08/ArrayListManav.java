package day08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListManav {

	/*
	 * Basit bir manav alisveris programi yaziniz.
	 * 
	 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
	 * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
	 * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
	 * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
	 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
	 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster. 
	 *
	 * */
	static List <String> urunList = new ArrayList<>();
	static List <Float> urunFiyatlari = new ArrayList<>();
	static float toplamTutar =0;
	
	public static void main(String[] args) {
	
		urunList.add("Domates - Urun kodu: 0 \n");
		urunList.add("Biber - Urun kodu: 1 \n");
		urunList.add("Erik - Urun kodu: 2 \n");
		urunList.add("Kapuz - Urun kodu: 3 \n");
		urunList.add("Havuc - Urun kodu: 4");
		
		urunFiyatlari.add(2.0f);
		urunFiyatlari.add(3.0f);
		urunFiyatlari.add(5.0f);
		urunFiyatlari.add(5.0f);
		urunFiyatlari.add(3.0f);
		
		System.out.println(urunList.toString());
		 musteriSiparis();
				
		}
	public static void musteriSiparis() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hangi urunu almak istersiniz");
		int urun =scan.nextInt();
		System.out.println("Kac kilo almak istersiniz");
		float kilo =scan.nextFloat();
		
		float birUrunFiyati = urunFiyatlari.get(urun);
		float birUrunToplamFiyat = birUrunFiyati * kilo;
		toplamTutar+=birUrunToplamFiyat;
		
		System.out.println("Sectiginiz urun : "+ urunList.get(urun));
		System.out.println("Urun Fiyati : "+ birUrunToplamFiyat);
		
		System.out.println("Alisverise devam etmek isterseniz: 1 tikla \n Kasaya gitmek isterseniz: 2 tikla");
		int karar = scan.nextInt();
		if(karar==1) {
		musteriSiparis();
		
		}else {
			System.out.println("Toplam odenecek tutar: "+ toplamTutar);
		}
			scan.close();
	}

}
