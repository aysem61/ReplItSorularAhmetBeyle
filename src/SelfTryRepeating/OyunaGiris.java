package SelfTryRepeating;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OyunaGiris {

	static List<Integer>  paralistesi=new ArrayList<>();
	
	static Scanner scan=new Scanner(System.in);
	static int kutuNumaram,kutumdakiParamiktari;
	static Kutular kutular=new Kutular();
	
	
	public static void main(String[] args) {
		
		paralistesi.add(1);
		paralistesi.add(10);
		paralistesi.add(500);
		paralistesi.add(1000);
		paralistesi.add(5000);
		paralistesi.add(10000);
		paralistesi.add(50000);
		paralistesi.add(100000);
		paralistesi.add(250000);
		paralistesi.add(500000);
		
		System.out.println(paralistesi.toString());
		Collections.shuffle(paralistesi);
		System.out.println(paralistesi);
		
		kutulariOlustur();
		
		System.out.println("Oyunumuza Hos geldiniz!!");
		System.out.println("Lutfen bir KUTU seciniz !");
		kutuNumaram=scan.nextInt();
		kutumdakiParamiktari=paralistesi.get(kutuNumaram-1);
		
		System.out.println("Kutu numaraniz :"+kutuNumaram);
		//System.out.println("Kutunuzda ki Para :"+kutumdakiParamiktari);
		
		kutular.kendiKutumuKaldir(kutuNumaram);
		
		kutuSecmeActirma();
		
		

	}


	private static void kutuSecmeActirma() {
		System.out.println("\nKalan Kutular :"+kutular.acilmamisKutulariGoster());
		System.out.println("\nHangi Kutuyu actirmak istersiniz ? :");
		int secim=scan.nextInt();
		kutular.kutuActir(secim);
		
		if (kutular.kalanKutuSayisiniAl()==7
				|| kutular.kalanKutuSayisiniAl()==4
				|| kutular.kalanKutuSayisiniAl()==1) {
			System.out.println("Teklif : "+kutular.teklifAl());
			System.out.println("****** Kabul Ediyormusunuz ? ****\n1-Evet\n2-Hayir");
			int kabul=scan.nextInt();
			if(kabul==1) {
				System.out.println("Oyun Bitti .Kazandiginiz Para : "+kutular.teklifAl());
				System.out.println("Kutunda da "+kutumdakiParamiktari+" lira dir ");
			}else {
				if(kutular.kalanKutuSayisiniAl()>0) {
					kutuSecmeActirma();
				}else {
					System.out.println("Oyun Bitti ! \nKutundaki Para : "+kutumdakiParamiktari);
				}
			}
		
		}
		
		
	}


	private static void kutulariOlustur() {
//		
//		Kutu kutu1=new Kutu();
//		kutu1.setKutuNumarasi(1);
//		kutu1.setKutudakiParaMiktari(paralistesi.get(0));
		
		System.out.println(kutular.kalanKutuSayisiniAl());
		
		for(int i=0; i<10; i++) {
			Kutu kutu=new Kutu();
			kutu.setKutuNumarasi(i+1);// 1 2 3 4 5 6 7 8 9..
			kutu.setKutudakiParaMiktari(paralistesi.get(i));
			
			kutular.kutuEkle(kutu);
			
			//System.out.println("Kutu no : "+(i+1)+"  Para miktari :"+paralistesi.get(i));
			
		}
		
//		System.out.println(kutular.kalanKutuSayisiniAl());
//		
//		System.out.println(kutular.kutulardakiToplamPara()+" dir ");
//		
//		System.out.println(kutular.acilmamisKutulariGoster());
//		
//		
//		kutular.secilenKutuyuListedenKaldir(5);
//		
//        System.out.println(kutular.kalanKutuSayisiniAl());
//		
//		System.out.println(kutular.kutulardakiToplamPara()+" lira dir... ");
//		
//		System.out.println(kutular.acilmamisKutulariGoster());
		
		
	}

}
