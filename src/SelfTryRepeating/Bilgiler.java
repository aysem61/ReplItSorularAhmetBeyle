package SelfTryRepeating;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bilgiler {
	
	static List<String> isimler=new ArrayList<>();

	public Bilgiler() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
	
		isimler.add("ertugrul");
		isimler.add("betul");
		isimler.add("bunyamin");
		isimler.add("yusuf");
		
		System.out.println(isimler.toString());
		
		Collections.shuffle(isimler);// list icinde kileri rastgele karistirmak icin shuffle kullanilir 
		System.out.println(isimler.toString());
		
		// ArrayList ile obje tutmak.nesne tutabiliriz 
		
		List<Kutu> kutular=new ArrayList<>();
		
		Kutu kutu=new Kutu();
		kutular.add(kutu);
		
		// Override islemi 
		
		Child childNesnesi=new Child();
		System.out.println(childNesnesi.toString());
		childNesnesi.parentIsimYazdir();
		
		
		
	}

	
}
