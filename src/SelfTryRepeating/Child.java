package SelfTryRepeating;

public class Child extends Parent{
	
	public Child() {
		
	}
	
//	public Child(String isim) {
//		
//	}

	@Override
	public String toString() {
		
		return "Ben child class da ki toString methoduyum artik object class daki kullanilmaz..";
	}
	
	@Override 
	// override olunca  parent class daki  constructor ve  method artik  cagrilmaz ve child daki cagrilir .ezmis olduk
    public void parentIsimYazdir() {
		
		System.out.println("Ben Child  classim ..! ");
		
	}
}
