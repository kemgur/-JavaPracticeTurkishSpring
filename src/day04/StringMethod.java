package day04;

public class StringMethod {

	public static void main(String[] args) {
		
		//indexOf() Karakterin yerini belirler, indexini verir. 
		String str = "NewJersey";
		System.out.println(str.indexOf('J'));//4
		
		 //last index of() son gorunumu verir
		System.out.println(str.lastIndexOf('e'));//8

		//ilk ve son harfi yazdirma
		System.out.println(str.charAt(0));//ilk harf
		System.out.println(str.charAt(str.length()-1));//son harf
		
		//Kullanicidan ismini alalim. Let's get his name from the user.
		//Kullanicinin isminin ilk harfi ile son harfini yerdegistirelim.
		//Let's replace the first letter and the last letter of the user's name.
		System.out.println();
		char firstLetter = str.charAt(0);
		char lastLetter = str.charAt(str.length()-1);
		
		System.out.println(lastLetter + str.substring(1, str.length()-1) + firstLetter );
		
		//contains() methodu String icerisinde aranan karakteri var ise true, yoksa false verir
		//contains() methodu boolean return eder.
		System.out.println(str.contains("er"));//true
		
		
		//isEmpty() methodu stringin bos olup olmaadigini kontrol eder.
		String str1 = "";
		System.out.println(str1.isEmpty());//true
		
		//trim() methodu String'in bas ve sondaki bosluklari siler
		String str2 = "     Google    ";
		System.out.println(str2.length());//15
		System.out.println(str2.trim().length());//6
		
		//concat() iki stringi birlestirir.
		System.out.println(str.concat(str2));
		
		//replace() methodu String'de istenen karakterlerin baska bir karakterle degistirmemiz saglar
		System.out.println(str.replace("N", "Y"));
		
		/*valueOf() methodu rakamlardan olusan stringleri integer a donusturur.
		1) String'i Integer'a  donusturur. => Integer.valueOf(String)
		2) integer olan sayiyi String'e cevirir. => String.valueOf(int)
		*/
		String para1 = "1900";
		String para2 = "2500";
		System.out.println(para1 + para2);//19002500
		System.out.println(Integer.valueOf(para1) + Integer.valueOf(para2));//4400
		
		int num1 =100;
		int num2 = 200;
		System.out.println(String.valueOf(num1) + String.valueOf(num2));//100200
		
		
	}

}
