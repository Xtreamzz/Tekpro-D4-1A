/**
 * 
 * @author fadhil
 *
 */

import java.util.Scanner;
public class Soal1 {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		
		String s = input.nextLine();
		String[] token = s.split("[ !,?._'@]+");
		System.out.println(token.length);
		
		for(String kata : token){
            System.out.println(kata);
        }
	}
}
