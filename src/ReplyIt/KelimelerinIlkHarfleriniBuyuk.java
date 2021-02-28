package ReplyIt;

import java.util.Scanner;

public class KelimelerinIlkHarfleriniBuyuk {

	public static void main(String[] args) {
		/*Girilen metindeki tüm kelimelerin ilk harflerini büyük yapınız.
		 * (diğer harflere dokunmayın, büyükse büyük, küçükse küçük kalsın).
		 * 
		 * Örnek
         makeTitle("Bu bir başlıktır") 
        Bu Bir Başlıktır

        makeTitle("tüm ilk harfler büyük olacak")
        Tüm İlk Harfler Büyük Olacak
		 */

		Scanner scan = new Scanner(System.in);
	    System.out.println(makeTitle(scan.nextLine()));
	}

	public static String makeTitle(String s) {
		
		
		String cumle[]=s.split(" ");
		
		String yeniKelime="";
		
		for(int i=0; i<cumle.length; i++) {
			
			cumle[i]=cumle[i].substring(0,1).toUpperCase()+cumle[i].substring(1).toLowerCase()+" ";
		}
		
		for (int i=0; i<cumle.length; i++) {
			yeniKelime=yeniKelime+cumle[i];
		}
		
		return yeniKelime;
	}
}
