package ReplyIt;

import java.util.Arrays;

public class ArrayMultipleMethodSorusu {

	public static void main(String[] args) {
		/*Methoda iki sayı girelim ve  bize bir array dönsün. 
		 * Array elemanları 1.sayının 2. sayı kadar kendisi ile toplamından oluşsun.

		 * 
		 * Test Data:
           arrayOfMultiples(7, 5)

           sonuç: [7,14,21,28,35]
		 */
		
		
		arrayMultiples(7,5);
		
	}
	
	public static int[] arrayMultiples(int num,int length) {
		
		int arr[]=new int[length];
		
		for (int i=0; i<length; i++) {
			
			arr[i]=num*(i+1);
		}
		
		System.out.println("sonuc :"+Arrays.toString(arr));
		
		return arr;
	}


}
