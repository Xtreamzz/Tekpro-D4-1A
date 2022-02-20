/**
 * 
 * @author fadhil
 *
 */

import java.util.Scanner;
public class Soal5 {
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		
		String mobil1 = input.next();
		String mobil2 = input.next();
		String mobil3 = input.next();
		String mobil4 = input.next();
		
		String gabungan = mobil1 + mobil2 + mobil3 + mobil4;
		long satuBaris = Long.parseLong(gabungan);
		
		if((satuBaris - 999999) % 5 ==0) {
			System.out.println("berhenti");
        }
        else{
            System.out.println("jalan");
		}
	}
}
