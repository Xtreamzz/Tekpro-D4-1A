/**
 * 
 * @author fadhil
 *
 */

import java.util.Scanner;
public class Soal4 {
	public static void main(String[] args) {
		double totalGaji;
		Scanner input = new Scanner(System.in);
		
		double gajiPokok = 500000;
		double item = 50000;
		int terjual = input.nextInt();
		
		if(terjual > 80) {
			totalGaji = (gajiPokok + (item * terjual * 0.35));
		}
		else if(terjual >= 40) {
			totalGaji = (gajiPokok + (item * terjual * 0.25));
		}
		else if(terjual < 15) {
			totalGaji = (gajiPokok - ((item * terjual) * 0.15));
		}
		else {
			totalGaji = (gajiPokok + (item * terjual * 0.1));
		}
		
		System.out.println((int)totalGaji);
	}
}
