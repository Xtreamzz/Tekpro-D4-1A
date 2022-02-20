/**
 * 
 * @author fadhil
 *
 */

import java.util.Scanner;
public class Soal2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.next();
        int x = input.nextInt();
        String s2 = input.next();
        int y = input.nextInt();
        String s3 = input.next();
        int z = input.nextInt();
        
        System.out.println("================================");
        System.out.printf("%-15s%03d\n", s1, x);
        System.out.printf("%-15s%03d\n", s2, y);
        System.out.printf("%-15s%03d\n", s3, z);
        System.out.println("================================");
	}
}
