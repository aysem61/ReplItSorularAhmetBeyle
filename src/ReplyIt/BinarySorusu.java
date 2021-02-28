package ReplyIt;

import java.util.Scanner;

public class BinarySorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  long binary1, binary2;
		  int i = 0, remainder = 0;
		  int[] sum = new int[20];
		  
		  Scanner in = new Scanner(System.in);
		  binary1 = in.nextLong();
		  binary2 = in.nextLong();
		  
		  int num1 = Integer.parseInt(""+ binary1,2);
		  int num2 = Integer.parseInt(""+ binary2,2);
		  int toplam = num1+num2;
		  
		  String bin = Integer.toBinaryString(toplam);
		  System.out.println(bin);
	}

}
