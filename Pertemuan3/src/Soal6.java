/**
 * 
 * @author fadhil
 *
 */

import java.util.Scanner;
import java.math.BigInteger;
public class Soal6 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		String number1 = input.nextLine();
		String number2 = input.nextLine();
		
		BigInteger bignumber1 = new BigInteger(number1);
		BigInteger bignumber2 = new BigInteger(number2);
		
		System.out.println(bignumber1.add(bignumber2));
		System.out.println(bignumber1.multiply(bignumber2));
	}
}
