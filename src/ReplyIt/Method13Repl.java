package ReplyIt;

public class Method13Repl {

	public static void main(String[] args) {
		
		
		   /*
		     * Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.

             Test Data:

             isPrime(31) 
             true

             isPrime(18)
             false

		     */
		System.out.println(isPrime(32));
		
	}

	public static boolean isPrime(int num) {// gelecekte birisi bir deger girecek sen onu main yada bir yerde kullanacaksin 
		
		int count=0;
		
		for (int i=2; i<num;i++) {
			
			if (num%i==0) {
				
				count++;
			}
		}
		
		if (count>0) {
			return false;
		}else 
			System.out.println();
			return true;
		
		
	}
}
